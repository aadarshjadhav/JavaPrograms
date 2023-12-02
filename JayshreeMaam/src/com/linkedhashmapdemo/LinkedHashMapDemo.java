package com.linkedhashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	
	public static void main(String args[])
	{
		HashMap<Integer,String> hash_map= new HashMap<>();
		hash_map.put(11,"Red" );
		hash_map.put(12,"White");
		hash_map.put(13,"Purple" );
		hash_map.put(15,"Blue" );
		
		
		LinkedHashMap<Integer, String> linked_hash_map= new LinkedHashMap<>(hash_map);
		linked_hash_map.put(16,"Black" );
		linked_hash_map.put(78,"Pink");
		linked_hash_map.put(90,"Orange" );
		
//		Set<Entry<Integer,String>> set= linked_hash_map.entrySet();
//		Iterator<Entry<Integer,String>> itr=set.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Program to delete all elements from LinkedHashmap
		
//		linked_hash_map.clear();
		
		
		//check whether the linked hash map is empty or not
		System.out.println(linked_hash_map.isEmpty());
		
		//Remove entry from the map
		linked_hash_map.remove(13);
		
		Set<Entry<Integer,String>> set= linked_hash_map.entrySet();
		Iterator<Entry<Integer,String>> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Find the highest Key
		Set<Integer> s=linked_hash_map.keySet();
		int val=0;
		for(Integer x:s)
		{
			if(x>val)
				val=x;
		}
		
		System.out.println("The highest "+ val+"maping with value"+linked_hash_map.get(val));
		for(Integer x:s)
		{
			if(x<val)
				val=x;
			
		}
		System.out.println("The least key"+val+"mapping with value"+linked_hash_map.get(val));;
		
		
	}

	
	

}
