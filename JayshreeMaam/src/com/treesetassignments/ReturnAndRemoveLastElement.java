package com.treesetassignments;

import java.util.Iterator;
import java.util.TreeSet;

public class ReturnAndRemoveLastElement {
	
	public static void main(String args[])
	{
		TreeSet<String> treeset= new TreeSet<>();
		treeset.add("Yellow");
		treeset.add("Blue");
		treeset.add("Red");
		treeset.add("White");
		treeset.add("Purple");
		treeset.add("Black");
		
		//1st Way
		System.out.println("_______First Way_____");
		System.out.println("Remove Last Element:"+treeset.pollLast());
		
		
		for(String i:treeset)
			System.out.println(i);
		
		//2nd Way
		System.out.println("_______First Way_____");
		System.out.println("Remove Last element:"+treeset.remove(treeset.last()));
		for(String i:treeset)
			System.out.println(i);
		
		System.out.println("__________Reverse Order View ___________");
		Iterator<String> itr= treeset.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("__________Strictly Greater Than ___________");
		System.out.println("Strictly greater than:"+treeset.higher("Purple"));
		
		System.out.println("__________Strictly Less Than ___________");
		System.out.println("Strictly Less than:"+treeset.higher("Blue"));
		
	}

}
