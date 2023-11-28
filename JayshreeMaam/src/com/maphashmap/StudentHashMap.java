package com.maphashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentHashMap {
	
		public static void main(String args[])
		{
			HashMap<Integer,String> student_map= new HashMap<>();
			student_map.put(1, "Aadarsh");
			student_map.put(2, "Rohit");
			student_map.put(3, "Jayraj");
			student_map.put(4, "Abhishek");
			
			//Printing using keyset
			for(Integer s:student_map.keySet())
				System.out.println(s+ " "+student_map.get(s));
			
			System.out.println("Usiing Iterator_________");
			Set<Entry<Integer,String>> s=student_map.entrySet();
			Iterator<Entry<Integer,String>> set=s.iterator();
			
			while(set.hasNext())
			{
				System.out.println(set.next());
			}
			
		}

}
