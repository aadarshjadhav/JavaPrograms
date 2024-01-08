package com.finaltestpractices.nov_batch_version_2;
/*
 * There is list of cities available which contains object like :
[“Pune”,”Nasik”,”Dehli”,”Mumbai”,”Nasik”,”Pune”,”Mumbai”,”Mumbai”,”Dehli”]      
a. Count each city occurred how many times in the list . Use HashMap to do it.		[1]
b. Convert this list to Set. The set should be sorted based on length of String.
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.treesetassignments.Employee;
import com.treesetassignments.EmployeeIdComparator;

import java.util.Set;
import java.util.TreeSet;

public class CityOccurrences {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		
		list.add("Pune");
		list.add("Mumbai");
		list.add("Banglore");
		list.add("Mumbai");
		list.add("Chennai");
		list.add("Chennai");
		list.add("Chennai");
		
		HashMap<Integer,String> hashmap= new HashMap();
		Integer i=0;
		Iterator<String> itr_list=list.iterator();
		while(itr_list.hasNext())
		{
			
			hashmap.put(++i, itr_list.next());
		}
		
//		Set<Entry<Integer, String>> entries_hashmap=hashmap.entrySet();
//		Iterator<Entry<Integer, String>> itr_entries_hashmap=entries_hashmap.iterator();
//		while(itr_entries_hashmap.hasNext())
//		{
//			System.out.println(itr_entries_hashmap.next());
//		}
		
		//New hashmap for frequency
		HashMap<String,Integer> hashmap_frequency= new HashMap();
		
		//Creating Two iterators for original hashmap
		Set<Entry<Integer, String>> entries_hashmap2=hashmap.entrySet();
		Iterator<Entry<Integer, String>> itr2_entries_hashmap2=entries_hashmap2.iterator();
		int count=0;
		while(itr2_entries_hashmap2.hasNext())
		{
			Entry<Integer, String> itr2_entry=itr2_entries_hashmap2.next();
			String itr2_city_value=itr2_entry.getValue(); //Got first city string
			count=0;
			
			Iterator<Entry<Integer, String>> itr3_entries_hashmap2=entries_hashmap2.iterator();
			
			while(itr3_entries_hashmap2.hasNext())
			{
				Entry<Integer, String> itr3_entry=itr3_entries_hashmap2.next();
				String itr3_city_value=itr3_entry.getValue();
				if(itr2_city_value.equals(itr3_city_value))
				{
					
					count++;
				}
			}
			
			if(hashmap_frequency.containsKey(itr2_city_value))
			{
				
			}
			else
			{
				hashmap_frequency.put(itr2_city_value, count);
			}
			
		}
		
		//Iterating Hashmap frequency

		System.out.println("____________________Frequency_______________________");
		Set<Entry<String, Integer>> entries_hashmap_frequency=hashmap_frequency.entrySet();
		Iterator<Entry<String, Integer>> itr_entries_hashmap_frequency=entries_hashmap_frequency.iterator();
		while(itr_entries_hashmap_frequency.hasNext())
		{
			System.out.println(itr_entries_hashmap_frequency.next());
		}
		
		System.out.println("______________________Sorted String based on length of String______________");

		
		TreeSet<String> treeset= new TreeSet<>(new CityLengthComparator());
		Iterator<String> itr_list2=list.iterator();
		while(itr_list2.hasNext())
		{
			String str_city=itr_list2.next();
			treeset.add(str_city);
			
		}
		System.out.println("Treeset:"+treeset);
	}

}
