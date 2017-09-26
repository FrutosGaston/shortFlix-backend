package com.boot.ember.model;

import java.util.ArrayList;

public class User {
	private TypeOfUser typeOfUser;
	private String name;
	
	private String email;
	private String password;
	private ArrayList<Short> favourites = new ArrayList<Short>();
	private ArrayList<Short> alreadySeen = new ArrayList<Short>();
	private ArrayList<Short> directed = new ArrayList<Short>();
	
	public static final String NOT_A_DIRECTOR_MESSAGE = "You can't edit movies";
	
	public User(String name, String email, String password){
		this.typeOfUser = new RegisteredUser();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public void addShortToFavourites(Short aShort){
		favourites.add(aShort);
	}
	
	public void addShortToAlreadySeen(Short aShort){
		alreadySeen.add(aShort);
	}
	
	public void removeFromFavourites(Short aShort){
		favourites.removeIf(s -> s.getId()==aShort.getId());
	}
	
	public void cleanHistory(){
		alreadySeen = new ArrayList<Short>();
	}
	
	public void cleanFavourites(){
		favourites = new ArrayList<Short>();
	}
	
	public void changeDescription(Short aShort){
		typeOfUser.changeDescription(aShort, this);
	}

	public Object notADirectorException(){
		throw new RuntimeException(NOT_A_DIRECTOR_MESSAGE);
	}
	
	public void addDirected(Short aShort){
		directed.add(aShort);
	}
	
	public void removeFromDirected(Short aShort){
		directed.removeIf(s -> s.getId()==aShort.getId());
	}
	
	public void becomingDirector(){
		this.typeOfUser = new DirectorUser();
	}
	
	public ArrayList<Short> getFavourites() {
		return favourites;
	}

	public ArrayList<Short> getAlreadySeen() {
		return alreadySeen;
	}

	public ArrayList<Short> getDirected() {
		return directed;
	}

}
