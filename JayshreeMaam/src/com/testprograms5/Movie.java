package com.testprograms5;

import java.util.List;

public class Movie {
	
	int movieid;
	String moviename;
	List<String> actors;
	
	public Movie(int movieid, String moviename, List<String> actors) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.actors = actors;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", actors=" + actors + "]";
	}
	
	

}
