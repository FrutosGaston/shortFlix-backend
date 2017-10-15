package com.boot.ember.services;

import java.io.Serializable;

import org.hibernate.Session;

import com.boot.ember.dao.ShortFilmDAO;
import com.boot.ember.service.runner.Runner;

/**
 * Servicio generico para guardar o recuperar
 * objetos de forma genreica. 
 */
public class ShortflixService {
	
	private ShortFilmDAO shortFilmDAO;
	
	public ShortflixService(){
		this.shortFilmDAO = new ShortFilmDAO();
	}

	public ShortFilmDAO getShortFilmDAO() {
		return shortFilmDAO;
	}


}
