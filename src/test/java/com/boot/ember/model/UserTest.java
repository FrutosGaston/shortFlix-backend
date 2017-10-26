package com.boot.ember.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private ShortFilm mockShort;
	private User newUser;
	
	@Before
	public void setUp(){
		mockShort = mock(ShortFilm.class);
		newUser = new User("Spielberg","et@gmail.com", "et");
	}

	@Test
	public void testAddAShortToFavourites(){
		newUser.addShortToFavourites(mockShort);
		assertEquals(1, newUser.getFavourites().size());
	}
	
	@Test
	public void testAddAShortToAlreadySeen(){
		newUser.addShortToAlreadySeen(mockShort);
		assertEquals(1, newUser.getAlreadySeen().size());
	}
	
	@Test
	public void testAddAShortToDirected(){
		newUser.addDirected(mockShort);
		assertEquals(1, newUser.getDirected().size());
	}
	
	@Test
	public void testRemoveFromFavourites(){
		newUser.addShortToFavourites(mockShort);
		newUser.removeFromFavourites(mockShort);
		assertEquals(0, newUser.getFavourites().size());
	}
	
	@Test
	public void testRemoveFromDirected(){
		newUser.addDirected(mockShort);
		newUser.removeFromDirected(mockShort);
		assertEquals(0, newUser.getDirected().size());
	}
	
	@Test
	public void testClearHistory(){
		newUser.addShortToAlreadySeen(mockShort);
		newUser.cleanHistory();
		assertEquals(0, newUser.getAlreadySeen().size());
	}
	

}
