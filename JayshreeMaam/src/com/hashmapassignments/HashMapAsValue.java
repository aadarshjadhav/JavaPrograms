package com.hashmapassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//14.WAP to create a Map which stores another Map as a value.
//15.WAP to iterate the elements in the Map stored in the above Map

public class HashMapAsValue {
	
	public static void main(String args[])
	{
		HashMap<Integer,String> hashmap1= new HashMap<>();
		
		hashmap1.put(2, "Apple");
		hashmap1.put(4, "Orange");
		hashmap1.put(3, "Pineapple");
		hashmap1.put(1, "Guava");
		
		HashMap<Integer,HashMap> hashmap2= new HashMap<>();
		
		hashmap2.put(1, hashmap1);
		
		Set<Entry<Integer, HashMap>> entry_hashmap2=hashmap2.entrySet();
		Iterator<Entry<Integer, HashMap>> itr_hashmap2=entry_hashmap2.iterator();
		while(itr_hashmap2.hasNext())
		{
			Entry<Integer, HashMap> entry=itr_hashmap2.next();
			Integer key=entry.getKey();
			HashMap value_hashmap=entry.getValue();
			
			Set set_value=value_hashmap.entrySet();
			Iterator itr_inner_hashmap=set_value.iterator();
			
			System.out.println("Key:"+key);
			while(itr_inner_hashmap.hasNext())
				System.out.println(itr_inner_hashmap.next());
		}
	}
}
