package com.boot.ember.model;

import java.util.ArrayList;

import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
public class User {
	private TypeOfUser typeOfUser;
	private String name;
	
	private String email;
	private String password;
	private ArrayList<ShortFilm> favourites = new ArrayList<ShortFilm>();
	private ArrayList<ShortFilm> alreadySeen = new ArrayList<ShortFilm>();
	private ArrayList<ShortFilm> directed = new ArrayList<ShortFilm>();
	
	public static final String NOT_A_DIRECTOR_MESSAGE = "You can't edit movies";
	
	public User(String name, String email, String password){
		this.typeOfUser = new RegisteredUser();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public void addShortToFavourites(ShortFilm aShort){
		favourites.add(aShort);
	}
	
	public void addShortToAlreadySeen(ShortFilm aShort){
		alreadySeen.add(aShort);
	}
	
	public void removeFromFavourites(ShortFilm aShort){
		favourites.removeIf(s -> s.getId()==aShort.getId());
	}
	
	public void cleanHistory(){
		alreadySeen = new ArrayList<ShortFilm>();
	}
	
	public void cleanFavourites(){
		favourites = new ArrayList<ShortFilm>();
	}
	
	public void changeDescription(ShortFilm aShort){
		typeOfUser.changeDescription(aShort, this);
	}

	public Object notADirectorException(){
		throw new RuntimeException(NOT_A_DIRECTOR_MESSAGE);
	}
	
	public void addDirected(ShortFilm aShort){
		directed.add(aShort);
	}
	
	public void removeFromDirected(ShortFilm aShort){
		directed.removeIf(s -> s.getId()==aShort.getId());
	}
	
	public void becomingDirector(){
		this.typeOfUser = new DirectorUser();
	}
	
	public ArrayList<ShortFilm> getFavourites() {
		return favourites;
	}

	public ArrayList<ShortFilm> getAlreadySeen() {
		return alreadySeen;
	}

	public ArrayList<ShortFilm> getDirected() {
		return directed;
	}

}
