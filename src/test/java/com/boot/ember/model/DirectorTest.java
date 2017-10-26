package com.boot.ember.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class DirectorTest {
	
	private ShortFilm mockShort;
	private Director director;
	
	@Before
	public void setUp(){
		mockShort = mock(ShortFilm.class);
		director = new Director("Josh Cooley");
	}
	

	@Test
	public void testDirectorCreation() {
		assertEquals("Josh Cooley", director.getName() );
		assertTrue(director.getDirectedShorts().isEmpty());
	}
	
	@Test
	public void testDirectorDirectedAShort(){
		director.addDirectedShort(mockShort);
		assertFalse(director.getDirectedShorts().isEmpty());
	}

}
