package com.treesetassignments;

import java.util.TreeSet;

public class NumberOfElement {

	public static void main(String args[])
	{
		TreeSet<String> treeset= new TreeSet<>();
		treeset.add("Yellow");
		treeset.add("Blue");
		treeset.add("Red");
		treeset.add("White");
		
		System.out.println("Number of elments:"+treeset.size());
		
		int count=0;
		for(String s:treeset)
			count++;
		System.out.println("Number of elments using for loop iteration:"+count);
		
		System.out.println("________Elements before remove__________:");
		for(String s:treeset)
			System.out.println(s);
		
		treeset.remove("Blue");

		System.out.println("________Elements after remove_________:");
		for(String s:treeset)
			System.out.println(s);
		
		System.out.println("___________Removes the first element______");
//		System.out.println("_________Removes the first element______:"+treeset.pollFirst());
		String s1=treeset.pollFirst();
		System.out.println("Checking pollfirst:"+s1);
		for(String s:treeset)
			System.out.println(s);
		
		
		
		
		
	}
}
