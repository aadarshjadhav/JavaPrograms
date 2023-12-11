package com.hashmapassignments;

//11.WAP to create a map using Custom class as key and any other Custom class as value

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CustomClassHashMap {
	
	public static void main(String args[])
	{
		HashMap<CustomClassKey,CustomClassValue> hashmap= new HashMap<>();
		hashmap.put(new CustomClassKey(101,"Aadarsh"), new CustomClassValue("Jadhoo"));
		hashmap.put(new CustomClassKey(102,"Rohit"), new CustomClassValue("Khopaji"));
		hashmap.put(new CustomClassKey(103,"Jayraj"), new CustomClassValue("Jayu"));
		hashmap.put(new CustomClassKey(104,"Sudharshan"), new CustomClassValue("Dharshan"));
		
		Set<Entry<CustomClassKey, CustomClassValue>> entries=hashmap.entrySet();
		Iterator<Entry<CustomClassKey, CustomClassValue>>itr_entries=entries.iterator();
		System.out.println("Display Elements");
		while(itr_entries.hasNext())
		{
			Entry<CustomClassKey, CustomClassValue> element=itr_entries.next();
			CustomClassKey cus_obj=element.getKey();
			CustomClassValue cus_value_obj=element.getValue();
			
			System.out.println(cus_obj+":"+cus_value_obj);
		}
	}

}
