package com.example.movie.application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movie")
public class Movie {
	
	@Id
	private int id;
	
	private String movieName;
	private String hero;
	private String director;
	
	
	public Movie(int id, String movieName, String hero, String director) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.hero = hero;
		this.director = director;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", hero=" + hero + ", director=" + director + "]";
	}

}
