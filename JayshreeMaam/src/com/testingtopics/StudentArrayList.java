package com.testingtopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {
	
	public static void main(String args[])
	{
		ArrayList<Student> list= new ArrayList<>();
		
		//The Arrays.asList method in Java is a convenient way 
		//to convert an array into a fixed-size list. 
		//It returns a List view of the specified array. 
		//The resulting list is a backed (backed by the original array) and fixed-size view, 
		//meaning changes to the list will be reflected in the original array, and vice versa.
		
		list.add(new Student(1));
		list.add(new Student(2));
		list.add(new Student(3));
//		Collections.sort(list); 

//		The Collections.sort method in Java relies on the compareTo method to 
//		compare objects and sort them in their natural order. 
//		If you try to use Collections.sort on a list of objects that 
//		don't implement the Comparable interface or don't override the compareTo method, 
//		the compiler will generate an error because it doesn't know how to compare 
//		the objects for sorting.
		
		
		//The sorting algorithm iterates through the list and, for each pair of objects elements, 
		//calls the compareTo method to decide their order.
		
		Iterator<Student >itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		//why doesn't the compler show error when 
		//I pass a list containing integer elements and then see sort()?
		
		
		//When you pass a list containing integer elements to the Collections.sort method, 
		//the compiler does not show an error because the Integer class in Java already implements 
		//the Comparable interface. This means that Integer objects have a natural ordering 
		//based on their numeric values, 
		//and the compareTo method is already implemented in the Integer class.
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(1);
		list2.add(5);
		list2.add(7);
		list2.add(4);
		list2.add(6);
		Collections.sort(list2);
		ArrayList<String> list3= new ArrayList<>();
		list3.add("Aadarsh");
		list3.add("Rohit");
		list3.add("Jayraj");
		list3.add("Abhishek");
		Collections.sort(list3);
		System.out.println(list3 );
	}

}
