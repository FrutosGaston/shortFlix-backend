package com.boot.ember.services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.boot.ember.dao.UserDAO;
import com.boot.ember.model.ShortFilm;


public class ShortflixServiceTest {
	
	private ShortflixService shortflixService;

	@Test
	public void test_creation_of_short_in_db() {
		
		this.shortflixService = new ShortflixService();
		List<String> actors = new ArrayList<String>();
		actors.add("Jason Topolski");
		actors.add("A.J. Rienli III");
		ArrayList<String> creators= new ArrayList<String>();
		creators.add("Josh Cooley");
		this.shortflixService.getShortFilmDAO().save(new ShortFilm("George and AJ", "", 
		"Exclusive Pixar short featuring George and AJ, character from the feature film Up",
		0.0, "", 2009, Arrays.asList("animation"),"4:04", Arrays.asList("Josh Cooley"), 
		Arrays.asList("Jason Topolski", "A.J. Rienli III"), Arrays.asList("Josh Cooley"), 
		"https://www.youtube.com/watch?v=hF5KWMX3u4Y"));
		this.shortflixService.getShortFilmDAO().save(new ShortFilm("In a heartbeat", "", 
		"A closeted boy runs the risk of being outed by his own heart after it pops out of his chest to chase down the boy of his dreams",
		0.0, "", 2017, Arrays.asList("animation", "romance"),"4:05", Arrays.asList("Beth David", "Esteban Bravo"), 
		null, Arrays.asList("Beth David", "Esteban Bravo"), 
		"https://www.youtube.com/watch?v=2REkk9SCRn0"));
		
	}

}
