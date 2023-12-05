package com.treesetassignments;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetFromHashSet {
	
	public static void main(String args[])
	{
		HashSet<Integer> hashset= new HashSet<>();
		hashset.add(15);
		hashset.add(75);
		hashset.add(55);
		hashset.add(23);
		hashset.add(35);
		
		System.out.println("__________Displaying Hashset__________");
		for(Integer i:hashset)
			System.out.println(i);
		
		//1 Way
		System.out.println("__________Tree Set 1st Way__________");
		TreeSet<Integer> treeset1= new TreeSet<>(hashset); //Converting HashSet to TreeSet
		for(Integer i:treeset1)
			System.out.println(i);
		
		//2 Way
		System.out.println("__________Tree Set 2nd Way__________");
		TreeSet<Integer> treeset2= new TreeSet<>();
		System.out.println();
		for(Integer i:hashset)
			treeset2.add(i);
		
		for(Integer i:treeset2)
			System.out.println(i);
	}

}
