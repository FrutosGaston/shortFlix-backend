package com.boot.ember.dao;

import org.hibernate.Session;

import com.boot.ember.model.ShortFilm;
import com.boot.ember.service.runner.Runner;

public class ShortFilmDAO {
	
	public void save(ShortFilm shortFilm) {
		Runner.runInSession(() -> {
		Session session = Runner.getCurrentSession();
		session.save(shortFilm);
		return null;
		});
	}

}
