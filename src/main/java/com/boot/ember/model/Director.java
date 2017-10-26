package com.boot.ember.model;

import java.util.HashSet;
import java.util.Set;

public class Director {
	
	private String name;
	private Set<ShortFilm> directedShorts;
	
	public Director(String name){
		this.name = name;
		this.directedShorts = new HashSet<>();
	}
	
	public String getName(){
		return this.name;
	}
	
	public Set<ShortFilm> getDirectedShorts(){
		return this.directedShorts;
	}

	public void addDirectedShort(ShortFilm mockShort) {
		this.directedShorts.add(mockShort);
		
	}

}
