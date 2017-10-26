package com.boot.ember.services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import com.boot.ember.dao.UserDAO;
import com.boot.ember.model.Director;
import com.boot.ember.model.ShortFilm;
import com.boot.ember.model.User;


public class ShortflixServiceTest {
	
	private ShortflixService shortflixService;

	@Test
	public void test_creation_of_short_in_db() {
		
		this.shortflixService = new ShortflixService();
		Director director = new Director("Josh Cooley");
		
		// short 1: George and AJ
		this.shortflixService.getShortFilmDAO().save(new ShortFilm("George and AJ", "", 
		"Exclusive Pixar short featuring George and AJ, character from the feature film Up",
		0.0, "", 2009, Arrays.asList("Animation"),"4:04", Arrays.asList("Josh Cooley"), 
		Arrays.asList("Jason Topolski", "A.J. Rienli III"),new HashSet<Director>(Arrays.asList(director)), 
		"https://www.youtube.com/watch?v=hF5KWMX3u4Y"));
		ShortFilm georgeAndAJSF = this.shortflixService.getShortFilmDAO().get(1L);
		List<String> expectedGenres = Arrays.asList("Animation");
		assertEquals("George and AJ", georgeAndAJSF.getTitle());
		assertEquals(expectedGenres, georgeAndAJSF.getGenres());
		
	}
	
	@Test
	public void test_creation_of_user_in_db(){
		this.shortflixService = new ShortflixService();
		User user = new User("quentin", "quentin@tarantino.com", "mrbrown123");
		this.shortflixService.getUserDAO().save(user);
		User retrievedUser = this.shortflixService.getUserDAO().get("quentin@tarantino.com");
		assertEquals(user.getEmail(), retrievedUser.getEmail());
	}

}
