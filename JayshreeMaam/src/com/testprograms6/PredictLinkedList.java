package com.testprograms6;

import java.util.LinkedList;
import java.util.List;

public class PredictLinkedList {
	
	public static void main(String args[])
	{
		List<String> list1= new LinkedList<>();
		list1.add("Me");
		list1.add("You");
		list1.add("He");
		list1.add("She");
		list1.add("It");
		
		List<String> list2= new LinkedList<>();
		list2.add("You");
		list1.retainAll(list2); // removes elements in this list that are contained in thespecified collection
		
		for(String temp:list1)
			System.out.printf(temp+" ");
		
		System.out.println();
		
	}

}
