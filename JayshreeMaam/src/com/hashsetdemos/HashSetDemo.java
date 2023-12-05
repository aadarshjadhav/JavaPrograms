package com.hashsetdemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Blue");
		list.add("Red");
		list.add("White");
		list.add("Purple");
		list.add("Black");
		list.add("Blue");
		
		System.out.println("ArrayList:"+list);
		
		HashSet<String> hashset= new HashSet<>(list);
		
		System.out.println("HashSet:"+hashset);
		
		//Performing CRUD operations
		System.out.println("Add an element in hashset:");
		hashset.add("Grey");
		
		System.out.println("Checking whether the hashset has Purple:"+hashset.contains("Purple"));
		
		
		System.out.println("Checking if hashset is empty or not:"+hashset.isEmpty());
		
		
		hashset.clone();//Cloning method
		
		hashset.remove("Blue");
		
		System.out.println("Size:"+hashset.size());
		
		Iterator<String> itr= hashset.iterator();
		System.out.println("Display using iterator:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		hashset.clear();
		System.out.println("Print after using clear():"+hashset);
		
	}

}
