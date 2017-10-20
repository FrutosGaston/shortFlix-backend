package com.boot.ember.services;

import java.io.Serializable;

import org.hibernate.Session;

import com.boot.ember.dao.ShortFilmDAO;
import com.boot.ember.dao.UserDAO;
import com.boot.ember.service.runner.Runner;

/**
 * Servicio generico para guardar o recuperar
 * objetos de forma genreica. 
 */
public class ShortflixService {
	
	private ShortFilmDAO shortFilmDAO;
	private UserDAO userDAO;
	
	public ShortflixService(){
		this.shortFilmDAO = new ShortFilmDAO();
		this.userDAO = new UserDAO();
	}

	public ShortFilmDAO getShortFilmDAO() {
		return shortFilmDAO;
	}
	
	public UserDAO getUserDAO(){
		return userDAO;
	}


}
