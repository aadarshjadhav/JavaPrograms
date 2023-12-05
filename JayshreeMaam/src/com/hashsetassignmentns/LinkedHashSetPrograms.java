package com.hashsetassignmentns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import com.linkedhashmapdemo.Book;

public class LinkedHashSetPrograms {
	
	public static void main(String args[])
	{
		//Insertion order is maintained
		LinkedHashSet<String> linkedhashset= new LinkedHashSet<>();
		linkedhashset.add("Aadarsh");
		linkedhashset.add("Sudharshan");
		linkedhashset.add("Maroti");
		linkedhashset.add("Suraj");
		
		System.out.println("__________Use Iterator and observe Order of Elements______");
		//3.WAP to iterate through all elements in a HashSet and print the elements. 
		//Observe the order of elements.
		
		for(String i:linkedhashset)
			System.out.println(i);
		
		Iterator<String> itr=linkedhashset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//2.WAP to Convert a LinkedHashSet from an ArrayList
		
		ArrayList<String> list= new ArrayList<>();
		list.add("Rohit");
		list.add("Jayraj");
		list.add("Abhishek");
		list.add("Aadarsh");
		list.add("Aadarsh");
		list.add("Aadarsh");
		System.out.println("____________Before Converting Arraylist to LinkedHashSet_________");
		for(String i:list)
			System.out.println(i);
		
		System.out.println("____________Converting Arraylist to LinkedHashSet_________");
		LinkedHashSet<String> linkedhashset2= new LinkedHashSet<>(list);
		
		for(String i:linkedhashset2)
			System.out.println(i);
		
		System.out.println("____________Converting LinkedHashSet To Array without passing any arrgument_________");
		Object array[]=linkedhashset2.toArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println("____________Converting LinkedHashSet To Array by passing the argument_________");
		String array2[]= new String[linkedhashset.size()];
		linkedhashset.toArray(array2);
		System.out.println(Arrays.toString(array2));
		
		
		
		
		
	}

}
