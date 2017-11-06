package com.boot.ember.dao;

import org.hibernate.Session;

import com.boot.ember.model.ShortFilm;
import com.boot.ember.service.runner.Runner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class ShortFilmDAO {
	
	public void save(ShortFilm shortFilm) {
		Runner.runInSession(() -> {
		Session session = Runner.getCurrentSession();
		session.save(shortFilm);
		return null;
		});
	}
	
	public ShortFilm get(long id){
		return Runner.runInSession(() -> {
			Session session = Runner.getCurrentSession();
			return session.get(ShortFilm.class, id);
			});
	}

	/*public List<ShortFilm> allShorts() {
		return Runner.runInSession(() -> {
			Session session = Runner.getCurrentSession();
            String jpql = "select e from ShortFilm e";
            List<ShortFilm> shorts = session.createQuery(jpql, ShortFilm.class).getResultList();
            return shorts;
		});
	}*/
}
