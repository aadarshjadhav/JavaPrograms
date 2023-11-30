package com.hashmapassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

//1.        WAP to add elements to a HashMap without using generics (ie do not use <>) 
//			and print content of it. Use Integer as Key and String as Value. 
//			In second HashMap add elements of String type as Key and Integer as Value.

public class HashMapWithoutGenerics {
	
	public static void main(String args[])
	{
//		HashMap map1= new HashMap();
//		map1.put(1,"Aadarsh");
//		map1.put(2,"Rohit");
//		map1.put(3,"Jayraj");
//		
//		System.out.println("First Map!");
//		System.out.println(map1);
//		
//		HashMap map2= new HashMap();
//		map2.put("Aadarsh",1);
//		map2.put("Rohit",2);
//		map2.put("Jayraj",3);
////		map2.put(4, "Hi"); //Testing here just for fun
//		
//		System.out.println("Second Map!");
//		System.out.println(map2);
		
		//Now doing with Generic Map
		HashMap <String, Integer> map3= new HashMap<>();
		map3.put("Aadarsh", 47);
		map3.put("Abhishek", 57);
		map3.put("Jayraj", 67);
		map3.put("Rohit", 77);
		
//		WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
//		System.out.println(map3);
		
		System.out.println("_____________Using Iterator_________");
		Set<Entry<String,Integer>> m=map3.entrySet();
		Iterator<Entry<String,Integer>> set=m.iterator();
		
		while(set.hasNext())
		{
			System.out.println(set.next());
		}		
		
//		3. WAP to get only the Keys from a HashMap
		System.out.println("_____________only Keys_________");
		
//		Set<String> keys=map3.keySet(); //Ma'am will explain this later, during Set
//		
//		for(int i=0;i<keys.size();i++)
//		{
//			map3.get(keys);
//		}
		
		for(String s:map3.keySet())
			System.out.println("Key:"+s);

		
//		4.WAP to get only the Values from a HashMap
		
		for(Integer i:map3.values())
			System.out.println("Value:"+i);

//		5.WAP to copy all of the mappings from the specified HashMap to another map
		HashMap <String, Integer> map3_copy= new HashMap<String,Integer>(map3);
		System.out.println(map3_copy);
		
//		6.WAP to search for an element from HashMap using key
		System.out.println("_____________Single Key element_________");
		Integer ele= map3.get("Aadarsh");
		System.out.println(ele);
		
//		7.WAP to check if a HashMap contains a mapping for the specified value
		System.out.println("_____________If Map contains mapping for specified value___________");
		System.out.println(map3);
		System.out.println(map3.containsValue(47));
		
//		8.WAP to remove an element from HashMap using key
		map3.remove("Aadarsh");
		System.out.println(map3);

//  	9.WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
		
		
		System.out.println("_____________Get keys and iterate through the keys to remove entries from Map___________");
		
		Set<String> map_set=map3.keySet(); //Taking complete set of keys all together
		Iterator<String> itr=map_set.iterator();
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
		System.out.println(map3);
		
		
		
	}

}
