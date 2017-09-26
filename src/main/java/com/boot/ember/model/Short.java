package com.boot.ember.model;

import java.util.List;

public class Short {

    private final long id;
    private String title;
    private String cover;
    private String description;
    private double score;
    private String imdb;
    private Integer year;
    private List<String> genres, actors, writers, directors;
    private String duration;
    private String video;

    public Short(long id, String title, String cover, String description, double score, String imdb, Integer year, List<String> genres, String duration, List<String> writers, List<String> actors, List<String> directors, String video) {
        this.id = id;
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
        return id;
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

  public List<String> getDirectors() {
    return directors;
  }

  public String getVideo() {
    return video;
  }
  
}
