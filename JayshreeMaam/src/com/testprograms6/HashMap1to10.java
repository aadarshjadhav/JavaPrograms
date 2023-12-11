package com.testprograms6;
/*Q10>Create a hashmap <int,String> where key is integers 1 to 10 and string is number in words. 
 * Remove entry for which number is divisible by 3. 
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1to10 {
	
	public static void main(String args[])
	{
		HashMap<Integer,String> hashmap=new HashMap<>();
		hashmap.put(1, "One");
		hashmap.put(2, "Two");
		hashmap.put(3, "Three");
		hashmap.put(4, "Four");
		hashmap.put(5, "Five");
		hashmap.put(6, "Six");
		hashmap.put(7, "Seven");
		hashmap.put(8, "Eight");
		hashmap.put(9, "Nine");
		hashmap.put(10, "Ten");
		
		Set<Entry<Integer, String>> entries_hashmap=hashmap.entrySet();
		Iterator<Entry<Integer, String>> itr_entries_hashmap=entries_hashmap.iterator();
		
		while(itr_entries_hashmap.hasNext())
		{
			Entry<Integer, String> element=itr_entries_hashmap.next();
			Integer i=element.getKey();
			
			if(i%3==0)
			{
				itr_entries_hashmap.remove();
			}
		}
		
		
		for( Map.Entry<Integer,String> i:hashmap.entrySet())
			System.out.println(i);
	}

}
