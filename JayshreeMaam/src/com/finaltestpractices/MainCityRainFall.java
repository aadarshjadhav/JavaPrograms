package com.finaltestpractices;

import java.util.ArrayList;
import java.util.HashSet;

public class MainCityRainFall {

	public static void main(String[] args) {
		
		ArrayList<CityRainFall> list_july_only= new ArrayList<>();
		list_july_only.add(new CityRainFall ("Pune",25,0));
		list_july_only.add(new CityRainFall ("Banglore",30,0));
		
		ArrayList<CityRainFall> list_august_only= new ArrayList<>();
		list_august_only.add(new CityRainFall ("Pune",0,45));
		list_august_only.add(new CityRainFall ("Banglore",0,20));
		
		HashSet<CityRainFall> combined_hashset= new HashSet<>();
		
		combineRecords(combined_hashset,list_july_only);
		combineRecords(combined_hashset,list_august_only);
		
	}

}
