package com.testprograms5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MovieArrayList {
	
	public static void main(String args[])
	{
		List<String> list1=Arrays.asList("Amitabh Bachan","Shahid", "Vicky");
		List<String> list2=Arrays.asList("Abhishek","Leo", "Jake");
		List<String> list3=Arrays.asList("Amitabh Bachan","Shahrukh", "Virat");
		
		ArrayList<Movie> movielist= new ArrayList<Movie>();
		movielist.add(new Movie(101,"BhoothNath",list1));
		movielist.add(new Movie(102,"Bad Company",list2));
		movielist.add(new Movie(103,"BhoothNath2",list3));
		
		Iterator<Movie> itr=movielist.iterator();
		
		
		int count=0;
		while(itr.hasNext())
		{
			Movie m=itr.next();
			if(m.getActors().contains("Amitabh Bachan"))
				count++;
				
		}
		System.out.println("Amitabh Bacchan"+ " has:"+count);
		
		System.out.println(movielist);
		
		
	}

}
