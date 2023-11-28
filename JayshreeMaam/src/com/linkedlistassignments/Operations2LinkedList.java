package com.linkedlistassignments;

import java.util.Collections;
import java.util.LinkedList;

public class Operations2LinkedList {
	
	public static void main(String args[]) 
	{
		
		LinkedList<String> list= new LinkedList<>();
		list.add("Python");
		list.add("Java");
		list.add("Javascript");
		list.add("SQL");
		list.add("PostgreSQL");
		
//		Shufle all the elements in list		
		Collections.shuffle(list);	
		for(String s:list)
			System.out.println(s);
		
//		Add a new list
		System.out.println("Add an entire list to an existing glist");
		list.addAll(list);
		for(String s:list)
			System.out.println(s);

//		Check is list is empty or not, it return in boolean true or false
		System.out.println(list.isEmpty());
		
		
	
	}
	

}
