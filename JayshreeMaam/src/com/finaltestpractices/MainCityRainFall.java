package com.finaltestpractices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
		
		Iterator<CityRainFall> itr_combined_hashset=combined_hashset.iterator();
		
		while(itr_combined_hashset.hasNext())
		{
			CityRainFall obj_city_rain_fall=itr_combined_hashset.next();
			System.out.println(obj_city_rain_fall);
		}
	}	
	
	public static void combineRecords(HashSet<CityRainFall> set, ArrayList<CityRainFall> list)
	{
		
		System.out.println("Inside combineRecords Function:");
		Iterator<CityRainFall> itr_list = list.iterator();
		
		while(itr_list.hasNext())
		{
			System.out.println("Inside While loop:");
	        CityRainFall obj_cityfall = itr_list.next();

	        // Check if the set already contains the city
	        boolean cityExists = false;
	        CityRainFall existingRecord = null;
	        
	        //Using for loop to check if the hashset already has the object city from the list
	        for (CityRainFall record : set) 
	        {
	            if (record.equals(obj_cityfall)) 
	            {
	                cityExists = true;
	                existingRecord = record;
	                break;
	            }
	        }

	        // Combine the rainfall values if the city exists
	        if (cityExists) 
	        {
	            existingRecord.raininjul += obj_cityfall.raininjul;
	            existingRecord.raininaug += obj_cityfall.raininaug;
	        } 
	        else 
	        {
	            // Add the new record to the set
	            set.add(obj_cityfall);
//	            System.out.println("Output of obj_cityfall:");
//	            System.out.println(obj_cityfall);
	        }
		}
	}
}
