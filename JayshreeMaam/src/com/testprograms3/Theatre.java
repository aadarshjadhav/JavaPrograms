package com.testprograms3;

import java.util.Arrays;
import java.util.Scanner;

public class Theatre {
	
	int theatreid;
	String theatrename;
	String location;
	Movie[] m;
	
	public Theatre()
	{
		theatreid=0;
		theatrename="";
		location="";
		//m= new Movie();
	}
	
	public Theatre(int theatreid, String theatrename, String location, Movie[] m)
	{
		this.theatreid=theatreid;
		this.theatrename=theatrename;
		this.location=location;
		this.m=m;
	}
	
	public void setTheatreid(int theatre)
	{
		this.theatreid=theatre;
	}
	
	public void setTheatrename(String theatrename)
	{
		this.theatrename=theatrename;
	}
	
	public void setTheatrelocation(String location)
	{
		this.location=location;
	}
	
	public void setMovie(Movie[] m)
	{
		this.m=m;
	}
	
	public int getTheatreId()
	{
		return theatreid;
	}
	
	public String getTheatreName()
	{
		return theatrename;
	}
	
	public String getTheatreLocation()
	{
		return location;
	}
	
	public Movie[] getMovie()
	{
		return m;
	}
	
	public String toString()
	{
		return " Theatre ID:"+theatreid+ " Theatre Name:"+ theatrename+ "Theatre Location:"+ location + " Movie Details:"+Arrays.toString(m);
	}
	
	public static void main(String args[])
	{
		Movie m[]= new Movie[2];
		Theatre t[]= new Theatre[2];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Enter the Theatre ID,Name and location for No:" + i+1);
			t[i]= new Theatre();
			t[i].setTheatreid(sc.nextInt());
			t[i].setTheatrename(sc.next());
			t[i].setTheatrelocation(sc.next());
			
			System.out.println("Enter the movie details in that theatre:-");
			
			for(int j=0;j<m.length;j++)
			{
				System.out.println("Enter the movie id, name and rating for no:"+j+1);
				m[j]= new Movie();
				m[j].setMovieid(sc.nextInt());
				m[j].setMoviename(sc.next());
				m[j].setMovieRating(sc.nextInt());
				t[i].setMovie(m);
			}
			System.out.println(t[i]);
		}
		
	}
}
