package com.hashmapdemo;

import java.util.HashMap;

public class MapCreationDemo {
	
	public static void main(String args[])
	{
		HashMap<Integer, String> hashmap1= new HashMap<>(); //default arguments
		Integer i1= new Integer(1);
		Integer i2= new Integer(1);
		Integer i3= new Integer(2);
		
		hashmap1.put(i1,"Aadarsh");
		hashmap1.put(i2,"Rohit");
		hashmap1.put(i1,"Rohit");
		hashmap1.put(i3,"Rohit");
		System.out.println("hashmap1:"+hashmap1);
		
		//	HashMap<Integer,String> hm1 = new HashMap<>(20); // map with initial
		
		HashMap<String,Integer> hashmap2= new HashMap<>();
		hashmap2.put(new String("Aadarsh"), 25);
		hashmap2.put(new String("Aadarsh"), 21);
		System.out.println("hashmap1:"+hashmap2);
		hashmap2.get("Aadarsh");
		
		
		
	}

}
