package com.treemapassignments;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapBookComparator {
	
	public static void main(String args[])
	{
		TreeMap<Integer,String> tree_map= new TreeMap<>();
		tree_map.put(21, "Aadarsh");
		tree_map.put(45, "Sudharshan");
		tree_map.put(33, "Ishwar"); 
		tree_map.put(23, "Shalok");
		tree_map.put(65, "Suraj");
		tree_map.put(28, "Abhhishek");
		
		System.out.println(tree_map);
		
		
		NavigableSet<Integer> nset=tree_map.descendingKeySet();
		for(int i:nset)
		{
			System.out.println(i+" :"+tree_map.get(i));	
		}
		
		NavigableMap<Integer, String> nmap=tree_map.descendingMap();
		System.out.println(nmap);
		
		TreeMap<Book,Integer> book_tree_map= new TreeMap<>();
		book_tree_map.put(new Book(101,"Java", 477), 100);
		book_tree_map.put(new Book(105,"Advance Java", 600), 40);
		book_tree_map.put(new Book(103,"Java", 477), 80);
		book_tree_map.put(new Book(102,"Java", 477), 75);
		
		System.out.println(book_tree_map);
		
		
		BookComparatorName obj= new BookComparatorName();
		
		TreeMap<Book,Integer> book_tree_map_comp=new TreeMap<>(obj);
		
		book_tree_map_comp.put(new Book(101,"Java", 477), 100);
		book_tree_map_comp.put(new Book(102,"Advance", 600), 40);
		book_tree_map_comp.put(new Book(103,"Bava", 477), 80);
		book_tree_map_comp.put(new Book(104,"Cava", 477), 75);
		
		//When you add elements to a TreeMap, it needs to determine the order of the elements.
		//To do this, it relies on the comparison of keys. 
		//If the keys you are using are of a custom class (i.e., not a standard Java class like Integer or String), 
		//and you want the TreeMap to be able to order instances of your class correctly, 
		//you need to define how these instances should be compared.
		//This is where the compareTo method comes in. 
		//The compareTo method is defined in the Comparable interface, and it's used for comparing the "natural order" of objects. 
		//If your class implements Comparable and provides a meaningful implementation of compareTo, 
		//the TreeMap can use this method to compare instances of your class and order them accordingly.
		
		System.out.println("Book_comparator:"+book_tree_map_comp);
	}

}
