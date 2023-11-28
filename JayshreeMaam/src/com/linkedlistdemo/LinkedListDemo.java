package com.linkedlistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String args[])
	{
		ArrayList<Student> array_list= new ArrayList<>();
		
		array_list.add(new Student(1,"Sapana",45));
		array_list.add(new Student(2,"Kirti",75));
		
		//System.out.println("*******"+ al.get(1)+"\n");
		
		//same method will work in linked list
		//difference internally uses doubly linked list as data structure
		
		LinkedList<Student> ll=new LinkedList<>();
		
		ll.add(new Student(1, "Pushkar", 75));
		ll.add(new Student(2, "Ajay", 35));
		ll.add(new Student(3, "Amit", 65));
		ll.add(new Student(4, "Ram", 30));
		ll.add(2,new Student(5,"Pranav", 50));

		//System.out.println(ll.get(3));
		ll.set(0, new Student(6,"Abhijeet", 87));
		
		Collections.sort(ll); 
		
//		for(Student s:ll)
//			System.out.println("LinkedList " +s);
		
//		Iterator<Student> iter=ll.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
		LinkedList<String> l2=new LinkedList();
		l2.add("Shudarshan");
		l2.add("Ishwar");
		l2.add("Maroti");
		l2.add("Prashant");
		l2.add("Abhishek");
		l2.add(0,"Ashatosh");
		
//		for(String s:l2)
//		System.out.println(s);
	
//		l2.addFirst("Katie");
//		for(String s:l2)
//			System.out.println(s);
			
		l2.addLast("Jayraj");
		
		//l2.removeFirst();
		
		//l2.removeLast();
		
		Collections.sort(l2);
		
		for(String s:l2)
			System.out.println(s);

		LinkedList<String> languages= new LinkedList<>();
		
		//adding elements in the languages list
		languages.add("Python");
		languages.add("Java");
		languages.add("Javascript");
		System.out.println("LinkedList of Languages:"+ languages);
		
		//get the element from the languages linkedlist
		String str= languages.get(1);
		System.out.println(str);
		
		System.out.print("Element at index 1: " + str);

		
	}

}
