package com.linkedlistassignments;

import java.util.ArrayList;
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
		
//		1.Shufle all the elements in list		
		System.out.println("__________Shuffle an LinkedList__________");
		Collections.shuffle(list);	
		for(String s:list)
			System.out.println(s);
		
//		2.Join Two Lists
		System.out.println("__________Add an entire list to an existing glist__________");
		list.addAll(list);
		for(String s:list)
			System.out.println(s);

//		3.WAP to clone a linked list to another linked list.
		LinkedList<String> list3= (LinkedList)list.clone();
		System.out.println();
		System.out.println("____________Display Cloned List____________");
		for(String s:list3)
			System.out.println(s);
		
		//4.WAP to remove and return the first element of a linked list.
		System.out.println("___________ Remove and Return the First element_____________");
		System.out.println("Returns and removes first element:"+list3.removeFirst());
		for(String s:list3)
			System.out.println(s);
		
		//5.WAP to retrieve but does not remove, the first element of a linked list.
		System.out.println();
		System.out.println("__________Retrieve but does not remove, the first element_______________"+list3.getFirst());
		
		
		//6.WAP to retrieve but does not remove, the last element of a linked list.
		System.out.println();
		System.out.println("__________retrieve but does not remove, the last element __________:"+list3.getLast());
		
		
		//7.WAP to check if a particular element exists in a linked list.
		System.out.println();
		System.out.println("____________check if a particular element exists_____________:"+list3.contains("SQL"));
		
		//8.WAP to convert a linked list to array list.
		System.out.println();
		System.out.println("_________convert a linked list to ArrayList__________");
		ArrayList<String> arraylist= new ArrayList<>(list3);
		
		
		System.out.println("Display array list:"+arraylist);
		
		//9.WAP to compare two linked lists.
		System.out.println();
		System.out.println("___________Compare Two Linked lists___________");
		boolean status=true;
		LinkedList<String> list4= (LinkedList)list3.clone();
		System.out.println("_____________________________________________");
		System.out.println("List4 elements:");
		for(String s:list4)
			System.out.println(s);
		
		
		System.out.println();
		System.out.println("_____________________________________________");
		System.out.println("List3 elements:");
		for(String s:list3)
			System.out.println(s);
		
		for(int i=0;i<list3.size();i++)
		{
			if(list3.get(i).equals(list4.get(i)))
			{
				continue;
				
			}
			else
			{
				status=false;
				break;
			}
		}
		if(status)
			System.out.println("Both lists are equal!!");
		else
			System.out.println("Both lists are not equal!!");
		
		
		System.out.println();
		System.out.println("____________IsEmpty() List____________");
//		10.Check is list is empty or not, it return in boolean true or false
		System.out.println(list.isEmpty());
		
		//11.WAP to replace an element in a linked list.
		System.out.println();
		System.out.println("___________Replace an Element___________");
		System.out.println("Display before Replacing an element:");
		for(String s:list3)
			System.out.println(s);
		
		System.out.println();
		list3.add(1, "French");
		System.out.println("Display after Replacing an element:");
		for(String s:list3)
			System.out.println(s);
		
	}
	

}
