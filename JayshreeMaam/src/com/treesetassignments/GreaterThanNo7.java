package com.treesetassignments;

import java.util.Iterator;
import java.util.TreeSet;

public class GreaterThanNo7 {
	
	public static void main(String args[])
	{
		TreeSet<Integer> treeset= new TreeSet<>();
		treeset.add(5);
		treeset.add(3);
		treeset.add(6);
		treeset.add(12);
		treeset.add(10);
		treeset.add(1);
		treeset.add(7);
		treeset.add(17);
		
		System.out.println("Higher than 7:"+treeset.higher(7));
		
		//Iterate TreeSet using Iterator
		System.out.println("___________Iterator__________");
		Iterator<Integer> itr= treeset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
				
		System.out.println("__________Less than no 7_________");
		System.out.println("Less than no '7':"+treeset.lower(7));
		
	
	}

}
