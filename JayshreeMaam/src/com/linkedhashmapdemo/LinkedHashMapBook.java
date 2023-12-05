package com.linkedhashmapdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapBook {
	
	public static void main(String args[])
	{
		LinkedHashMap<Book,Integer> linked_hash_map= new LinkedHashMap<Book,Integer>();
		linked_hash_map.put(new Book(1,"Oliver Twist"," Charles"), 52);
		linked_hash_map.put(new Book(2,"Maze Runner"," Dashner"), 40);
		linked_hash_map.put(new Book(3,"The Thing"," Stephen"), 23);
		linked_hash_map.put(new Book(4,"Oliver Twist2"," Charles"), 70);
		
		Set<Entry<Book,Integer>> set= linked_hash_map.entrySet();
		Iterator<Entry<Book,Integer>> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> list_values=new ArrayList<>(linked_hash_map.values());
		Collections.sort(list_values);
		
		int minimum=list_values.get(0);
//		int maximum=list_values.get(list_values.size()-1);
//		System.out.println("maximum:"+maximum);
		
		System.out.println();
		System.out.println("___________Book which has minimum copies________");
		Set<Entry<Book,Integer>> set2= linked_hash_map.entrySet();
		Iterator<Entry<Book,Integer>> itr2=set2.iterator();
		Book obj=null;
		while(itr2.hasNext())
		{
			Entry<Book,Integer> element=itr2.next();
			int val=element.getValue();
			obj=element.getKey();
			if(minimum>val)
			{
				minimum=val;
				obj=element.getKey();
				
			}
		}
		System.out.println("Minimum:"+minimum+" :"+obj);
		
		System.out.println();
		System.out.println("___________Book which has maximum copies________");
		Set<Entry<Book,Integer>> set3= linked_hash_map.entrySet();
		Iterator<Entry<Book,Integer>> itr3=set3.iterator();
		Book obj2=null;
		int maximum=0;
		while(itr3.hasNext())
		{
			Entry<Book,Integer> element=itr3.next();
			int val=element.getValue();
			obj=element.getKey();
			if(val>maximum)
			{
				maximum=val;
				obj=element.getKey();
				
			}
		}
		System.out.println("Mmaximum:"+maximum+" :"+obj);
		
	}

}
