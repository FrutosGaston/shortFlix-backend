package com.boot.ember.service.runner;

import java.util.function.Supplier;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Runner {
	
private static final ThreadLocal<Session> CONTEXT = new ThreadLocal<>();
	
	public static <T> T runInSession(Supplier<T> block) {
		// permite anidar llamadas a Runner sin abrir una nueva
		// Sessino cada vez (usa la que abrio la primera vez)
		if (CONTEXT.get() != null) {
			return block.get();
		}
		
		Session session = null;
		Transaction tx = null;
		
		try {
			session = SessionFactoryProvider.getInstance().createSession();
			tx = session.beginTransaction();
			
			CONTEXT.set(session);
			
			//codigo de negocio
			T result = block.get();
			
			tx.commit();
			return result;
		} catch (RuntimeException e) {
			//solamente puedo cerrar la transaccion si fue abierta antes,
			//puede haberse roto el metodo ANTES de abrir una transaccion
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			throw e;
		} finally {
			if (session != null) {
				CONTEXT.set(null);
				session.close();
			}
		}
	}

	public static Session getCurrentSession() {
		Session session = CONTEXT.get();
		if (session == null) {
			throw new RuntimeException("No hay ninguna session en el contexto");
		}
		return session;
	}
}
