package com.testprograms5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverseOrder {
	
	public static void main(String args[])
	{
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(23);
		list.add(33);
		list.add(45);
		list.add(54);
		list.add(36);
		list.add(65);
		
		System.out.println("List in Order:"+list);
		
		System.out.println("List in reverse Order:");
		
		ListIterator<Integer> itr=list.listIterator(list.size());
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		
	}

}
