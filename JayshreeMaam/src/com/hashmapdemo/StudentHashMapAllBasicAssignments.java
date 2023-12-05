package com.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentHashMapAllBasicAssignments {
	
		public static void main(String args[])
		{
			HashMap<Integer,String> student_map= new HashMap<>();
			student_map.put(1, "Aadarsh");
			student_map.put(4, "Rohit");
			student_map.put(3, "Jayraj");
			student_map.put(2, "Abhishek");
			student_map.put(5, "Sudharshan");
			student_map.put(6, "Jitendra");
			
			//Printing using keyset
			//WAP to get only the Keys from a HashMap(Done)
			for(Integer s:student_map.keySet())
				System.out.println(s+ " "+student_map.get(s));
			
			System.out.println("Usiing Iterator_________");
			Set<Entry<Integer,String>> s=student_map.entrySet();
			Iterator<Entry<Integer,String>> set=s.iterator();
			
			while(set.hasNext())
			{
				System.out.println(set.next());
			}
			
			//WAP to get only the Values from a HashMap
			System.out.println();
			System.out.println("___________Get Only Values__________");
			System.out.println("Values are:"+student_map.values());
			
			
			//WAP to copy all of the mappings from the specified HashMap to another map
			System.out.println();
			System.out.println("___________Copy all of the mappings from the specified HashMap to another map__________");
			HashMap<Integer,String> student_map_copy= new HashMap<>();
			student_map_copy.putAll(student_map);
			
			Set<Entry<Integer,String>> set2=student_map.entrySet();
			Iterator<Entry<Integer,String>> itr2=set2.iterator();
			while(itr2.hasNext())
			{
				System.out.println(itr2.next());
			}
			
			//6.WAP to search for an element from HashMap using key
			System.out.println();
			System.out.println("___________Search for an element from HashMap using key__________");
			System.out.println("Searching a specified key:"+student_map.containsKey(2));
			
			Set<Entry<Integer,String>> set3=student_map.entrySet();
			Iterator<Entry<Integer,String>> itr3=set3.iterator();
			while(itr3.hasNext())
			{
				Entry<Integer, String> element=itr3.next();
				if(element.getKey().equals(2))
					System.out.println(element);
			}
			
			//7.WAP to test if a HashMap contains a mapping for the specified value
			System.out.println();
			System.out.println("___________Test if a HashMap contains a mapping for the specified value_________");
			System.out.println("Searching a specified value:"+student_map.containsValue("Rohit"));
			
			
			//8.WAP to remove an element from HashMap using key
			System.out.println();
			System.out.println("___________Remove an Element from HashMap using key_________");
			System.out.println("Removing an element using key:"+student_map.remove(1));
			
			//9.WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
			System.out.println();
			System.out.println("___________Empty Map, Do it by getting the Keys and terate through them___________");
			
			Set<Integer> only_keys=student_map.keySet();
			Iterator<Integer> itr_of_keys=only_keys.iterator();
			
			Set<Entry<Integer,String>> set5=student_map.entrySet();
			Iterator<Entry<Integer,String>> itr5=set5.iterator();
			
			while(itr5.hasNext())
			{
				
				Integer i=itr_of_keys.next();
				
				if(student_map.containsKey(i))
				{
					student_map.remove(i);
				}
					
			}
			System.out.println("Printing after removing each element:"+student_map);
			
			
			
		}

}
