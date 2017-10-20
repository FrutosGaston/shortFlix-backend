package com.boot.ember.dao;

import org.hibernate.Session;

import com.boot.ember.model.User;
import com.boot.ember.service.runner.Runner;


public class UserDAO {
	public void save(User user) {
		Runner.runInSession(() -> {
		Session session = Runner.getCurrentSession();
		session.save(user);
		return null;
		});
	}
	
	public User get(String id){
		return Runner.runInSession(() -> {
			Session session = Runner.getCurrentSession();
			return session.get(User.class, id);
			});
	}

	

}
