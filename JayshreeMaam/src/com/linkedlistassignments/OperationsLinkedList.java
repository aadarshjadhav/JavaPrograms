package com.linkedlistassignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class OperationsLinkedList {
	
	public static void main(String args[]) 
	{
		
		LinkedList<String> list= new LinkedList<>();
		list.add("Python");
		list.add("Java");
		list.add("Javascript");
		//Print entire list at once
//		System.out.println("LinkedList of Languages:"+ list);
		
		//WAP to append the specified element to the end of a linked list.
		list.addLast("Angular");
		
		//WAP to iterate through all elements in a linked list.
		//1st Way of iterating
//		for(String s:list)
//			System.out.println(s);
//		
		//2nd Way of iterating
//		Iterator<String> iter=list.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
		//3rd Way ListIterator
//		ListIterator<String> list_iterator= list.listIterator();
//		System.out.println("Iterating usinig list iterator");
//		while(list_iterator.hasNext())
//		{
//			System.out.println(list_iterator.next());
//		}
		
		//3.WAP to iterate through all elements in a linked list starting at the specified position
//		for(int i=2;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
	//	4.  WAP to iterate a linked list in reverse order.	
//		System.out.println("Iterator in reverse order");
//		Iterator<String> list_iterator= list.descendingIterator();
//		while(list_iterator.hasNext())
//		{
//			System.out.println(list_iterator.next());
//		}
		
	//	5.WAP to insert the specified element at the specified position in the linked list.
		list.add(2, "SQL");
		for(String s:list)
			System.out.println(s);
	
	// 	6.WAP to insert elements into the linked list at the first and last position.
		
		list.addFirst("Git");
		list.add(0,"Swift");
		list.addLast("PostgreSQL");
		list.add(list.size(),"Git");
		
	//	7.WAP to insert the specified element at the front of a linked list.
	//  8.WAP to insert the specified element at the end of a linked list.
		
	//  9.WAP to insert some elements at the specified position into a linked list.	
		
	//	10.WAP to get the first and last occurrence of the specified elements in a linked list.	
	//	1st way, using built in methods: indexOf() and lastIndexOf()
//		System.out.println(list.indexOf("Git"));
//		System.out.println(list.lastIndexOf("Git"));
		
	//	Using Logic
//		int first_occur=0;
//		int last_occur=0;
//		int count=0;
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).equals("Git"))
//			{
//				count++;
//				if(count==1)
//					first_occur=i;
//				else
//					last_occur=i;
//			}
//		}
//		System.out.println("_______________________List Elements are :");
//		System.out.println(list);
//		System.out.println("First and last occurence of Git");
//		System.out.println(first_occur);
//		System.out.println(last_occur);
		
		//11.  WAP to display the elements and their positions in a linked list.
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println("Position:"+i+" "+ list.get(i));
//		}
		
//		12.  WAP to remove a specified element from a linked list.
			
//			System.out.println("Removing element Git");
//			list.remove("Git");
//			list.remove("Python");
//			for(String s:list)
//				System.out.println(s);
//		13.  WAP to remove first and last element from a linked list.
		
		list.removeFirst();
		list.removeLast();
		
//		14.  WAP to remove all the elements from a linked list.
		list.clear();
		
		
	}

}
