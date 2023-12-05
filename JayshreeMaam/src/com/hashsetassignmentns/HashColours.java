package com.hashsetassignmentns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashColours {
	
	public static void main(String args[])
	{
		//1.WAP to create a HashSet with some colors (String) using generics
		
		HashSet<String> hashset= new HashSet<>();
		
		hashset.add("Blue");
		hashset.add("Red");
		hashset.add("White");
		hashset.add("Black");
		
		//2.WAP to create a HashSet from an ArrayList
		
		ArrayList<String> list= new ArrayList<>();
		list.add("Aadarsh");
		list.add("Shudarshan");
		list.add("Suraj");
		list.add("Abhishek");
		
		
		HashSet<String> hashset2= new HashSet<>(list);
		for(String i:hashset2)
			System.out.println(i);
		
		//3.WAP to iterate through all elements in a HashSet and print the elements. 
		//Observe the order ofelements.
		System.out.println("___________Display using Iterator____________");
		Iterator<String> itr= hashset2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//4.WAP to empty a HashSet.
		System.out.println("___________Empty an hashset____________");
		hashset2.clear();
		System.out.println(hashset2);
		
		
	}

}
