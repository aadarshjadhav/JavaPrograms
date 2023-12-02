package com.hashmapassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordFrequencyCountMap {
	
	public static void main(String args[])
	{
		String str="java is a language java is not a language like SQL";
		
		HashMap<String,Integer> string_map= new HashMap<String,Integer>();
		
		String str_array[]=str.split(" ");
		
		for(int i=0;i<str_array.length;i++)
		{
			if(string_map.containsKey(str_array[i]))
			{
				int count= string_map.get(str_array[i]);
				string_map.put(str_array[i],count+1);
			}
			else
			{
				string_map.put(str_array[i],1);
			}
		}

		Set<String> set=string_map.keySet(); //Get Set of of entire Keys from the hashmap
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println("Word:"+s);
			System.out.println(string_map.get(s));
		}
		
	}

}
