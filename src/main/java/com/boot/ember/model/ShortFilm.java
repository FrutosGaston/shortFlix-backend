package com.boot.ember.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class ShortFilm {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    private long shortFilmId;
    private String title;
    private String cover;
    private String description;
    private double score;
    private String imdb;
    private Integer year;
    @Fetch(FetchMode.SELECT)
    @ElementCollection(targetClass=String.class, fetch = FetchType.EAGER)
    private List<String> genres, actors, writers;
    @Transient
    private Set<Director> directors;
    private String duration;
    private String video;

    public ShortFilm(){
    	}
    
    public ShortFilm(String title, String cover, String description, double score,
    			 String imdb, Integer year, List<String> genres, String duration, 
    			 List<String> writers, List<String> actors, Set<Director> directors, String video) {
        this.title = title;
        this.cover = cover;
        this.description = description;
        this.score = score;
        this.imdb = imdb;
        this.year = year;
        this.genres = genres;
        this.duration = duration;
        this.writers = writers;
        this.actors = actors;
        this.directors = directors;
        this.video = video;
    }

    public long getId() {
        return shortFilmId;
    }

    public String getTitle() {
        return title;
    }

  public String getCover() {
    return cover;
  }

  public String getDescription() {
    return description;
  }

  public double getScore() {
    return score;
  }

  public String getImdb() {
    return imdb;
  }

  public Integer getYear() {
    return year;
  }

  public List<String> getGenres() {
    return genres;
  }

  public String getDuration() {
    return duration;
  }

  public List<String> getWriters() {
    return writers;
  }

  public List<String> getActors() {
    return actors;
  }

  public Set<Director> getDirectors() {
    return directors;
  }

  public String getVideo() {
    return video;
  }
  
}
