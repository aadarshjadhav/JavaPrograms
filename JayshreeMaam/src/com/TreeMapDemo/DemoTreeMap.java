package com.TreeMapDemo;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class DemoTreeMap {
	
	public static void main(String args[])
	{
		TreeMap<Integer,String> tree_map= new TreeMap<>();
		tree_map.put(21, "Aadarsh");
		tree_map.put(45, "Sudharshan");
		tree_map.put(33, "Ishwar"); 
		tree_map.put(23, "Shalok");
		tree_map.put(65, "Suraj");
		tree_map.put(28, "Abhhishek");
		
		NavigableSet<Integer> nset=tree_map.descendingKeySet();
		for(int i:nset)
		{
			System.out.println(i+" :"+tree_map.get(i));	
		}
		
		NavigableMap<Integer, String> nmap=tree_map.descendingMap();
		System.out.println(nmap);
		
		
	}

}
