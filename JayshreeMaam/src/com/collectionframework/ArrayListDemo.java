package com.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> technology= new ArrayList<>();
		System.out.println(technology.size());
		technology.add("Java");
		technology.add("C#");
		technology.add("MobileDevelopment Flutter");
		technology.add("Java Framework");

		System.out.println(technology);
		System.out.println(technology.size());
		
		technology.add(1,"Asp dotnet");
		System.out.println(technology);
		
		technology.remove(1);
		System.out.println(technology);
		
		boolean f=technology.remove("C#"); // this method returns a boolean value
		System.out.println(f);
		System.out.println(technology);
		
		ArrayList<String> l1= new ArrayList<>();
		l1.add("maths");
		l1.add("chemistry");
		l1.add("Bio");
		
		technology.addAll(l1);
		System.out.println(technology);
		ArrayList<String>l2= new ArrayList<>();
		
		l2.add("English");
		l2.add("Hindi");
		technology.addAll(2,l2);
		System.out.println(technology);

		
	}
	
	
}
