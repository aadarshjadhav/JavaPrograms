package com.testprograms3;

public class Movie {
	
	int movieid;
	String moviename;
	int rating;
	
	public Movie()
	{
		movieid=0;
		moviename="";
		rating=0;
	}
	public Movie(int movieid,String moviename, int rating )
	{
		this.movieid=movieid;
		this.moviename=moviename;
		this.rating=rating;
		
	}
	
	public void setMovieid(int movieid)
	{
		this.movieid=movieid;
		
	}

	public void setMoviename(String moviename)
	{
		this.moviename=moviename;
		
	}
	
	public void setMovieRating(int rating)
	{
		this.rating=rating;
	}
	
	public int getMovieid()
	{
		return movieid;
	}
	
	public String getMoviename()
	{
		return moviename;
	}
	
	public int getMovieRating()
	{
		return rating;
	}
	
	public String toString()
	{
		return " Movie ID:"+ movieid+ " Movie Name:"+ moviename+ " Rating:" + rating; 
	}
}
