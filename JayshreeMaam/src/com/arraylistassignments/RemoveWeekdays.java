package com.arraylistassignments;

import java.util.ArrayList;
import java.util.Iterator;

import com.collectionframework.Student;

// Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc) 
//Remove elements from list for which string length is more than 7

public class RemoveWeekdays {

	public static void main(String[] args) {
		
		ArrayList<String> arrayweekdays= new ArrayList<>();
		arrayweekdays.add("Monday");
		arrayweekdays.add("Sunday");
		arrayweekdays.add("Tuesday");
		arrayweekdays.add("Wednessday");
		arrayweekdays.add("Thursday");
		arrayweekdays.add("Friday");
		arrayweekdays.add("Saturday");
		
		Iterator<String> itr=arrayweekdays.iterator();
		
		System.out.println("Before Size:"+arrayweekdays.size());
		
		while(itr.hasNext())
		{
			String day=itr.next();
			if(day.length()>7)
			{
				itr.remove();
			}
		}
		
		for(String s:arrayweekdays)
			System.out.println(s);
		
		System.out.println("After Size:"+arrayweekdays.size());
	}

}
