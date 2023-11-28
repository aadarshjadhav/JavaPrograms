package com.arraylistdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {
	
	public static void main(String args[])
	{
		ArrayList<Student> list= new ArrayList<>();
		
		ArrayList<Integer> L1= new ArrayList<>(Arrays.asList(78,45,90,75,53));
		list.add(new Student(1,"Pinky",L1));
		
		ArrayList<Integer> L2= new ArrayList<>(Arrays.asList(87,89,90,71,65));
		list.add(new Student(4,"Chinky",L2));
		
		ArrayList<Integer> L3= new ArrayList<>(Arrays.asList(45,58,81,70,67));
		list.add(new Student(3,"Tinky",L3));
		
		ArrayList<Integer> L4=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new Student(7,"Piglly",L4));
		
		ArrayList<Integer> L5= new ArrayList<>(Arrays.asList(89,82,90,56,72));
		list.add(new Student(5,"Giggly",L5));
		
		ArrayList<Integer> L6= new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new Student(6,"Higlly",L6));
		
		Iterator<Student> itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("______________________________");
		System.out.println("Sorting using Stduent name");
		
		Collections.sort(list); //The sorting algorithm iterates through the list and, for each pair of objects elements, 
								//calls the compareTo method to decide their order.
		
		itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//list.add(new Student(6,"Higlly",L6));
			
		}
		
	}

}
