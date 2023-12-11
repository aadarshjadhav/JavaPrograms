package com.treesetassignments;

import java.util.TreeSet;

public class TreeSetAddAll {
	
	public static void main(String args[])
	{
		TreeSet<Integer> treeset=new TreeSet<>();
		treeset.add(1);
		treeset.add(7);
		treeset.add(4);
		treeset.add(6);
		treeset.add(3);
		treeset.add(3);
		
		TreeSet<Integer> treeset1= new TreeSet<>();
		treeset1.add(8);
		treeset1.add(10);
		treeset1.add(12);
		treeset1.add(11);
		//treeset1.add(null); //You cannot add null in TreeSet, because it doesn't know which object to sort with
		
		treeset.addAll(treeset1);
		
		for(Integer i:treeset)
			System.out.println(i);
	}
}
