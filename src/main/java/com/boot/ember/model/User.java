package com.boot.ember.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

@Entity
public class User {
	//private TypeOfUser typeOfUser;
	private String name;
	@Id
	private String email;
	private String password;
	@OneToMany
	private List<ShortFilm> favourites = new ArrayList<ShortFilm>();
	@OneToMany
	private List<ShortFilm> alreadySeen = new ArrayList<ShortFilm>();
	@OneToMany
	private List<ShortFilm> directed = new ArrayList<ShortFilm>();
	
	public static final String NOT_A_DIRECTOR_MESSAGE = "You can't edit movies";
	
	public User(String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public User(){
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
	//	typeOfUser.changeDescription(aShort, this);
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
	//	this.typeOfUser = new DirectorUser();
	}
	
	public List<ShortFilm> getFavourites() {
		return favourites;
	}

	public List<ShortFilm> getAlreadySeen() {
		return alreadySeen;
	}

	public List<ShortFilm> getDirected() {
		return directed;
	}
	
	public String getEmail(){
		return email;
	}

}
