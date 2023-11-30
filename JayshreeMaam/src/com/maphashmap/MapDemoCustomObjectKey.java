package com.maphashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class MapDemoCustomObjectKey {
	
	public static void main(String args[])
	{
		Map<Apple,Integer> applemap= new HashMap<>();
		Apple a1 = new Apple(150,"Shimla Apple");
		System.out.println("Hashcode for first apple after contructor call i.e a1:"+a1.hashCode());
		applemap.put(a1, 2200);
		System.out.println("First object has been added!");
		System.out.println();
		
		Apple a2=new Apple(300, "Washinton apple"); 
		System.out.println("Hashcode for second apple after contructor call i.e a2:"+a2.hashCode());
		applemap.put(a2,1500);
		System.out.println("Second object has been added!");
		System.out.println();
		
		
		Apple a3=new Apple(450, "Green Apple");
		System.out.println("Hashcode for Third apple after contructor call i.e a3:"+a3.hashCode());
		applemap.put(a3, 4508);
		System.out.println("Third object has been added!");
		System.out.println();
		
		Set<Entry<Apple, Integer>> set=applemap.entrySet();
		Iterator<Entry<Apple,Integer>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Apple,Integer> e=itr.next();
			System.out.println("key:"+e.getKey());
			System.out.println("Value:"+e.getValue());
			
		}
		
		Apple a4= new Apple(150,"Shimla Apple");
		System.out.println("Hashcode for 4th apple after contructor call i.e a4:"+a4.hashCode());
		System.out.println();
		System.out.println("Now calling put method for fourth object");
		applemap.put(a4, 2300);
		System.out.println("Fourth object has been added!");
		System.out.println();
		
		//Hashcode is different every time you create an object with a new keyword, 
		//even if the content is exactly same.
		//So, content of a1 and a4 is same, but their hascode is different
		
		System.out.println("Now calling get method for fourth object");
		System.out.println(applemap.get(a4));
		
		
	}


	/*
	 * 1)If two objects are equal, then they must have the same hashcode.
	 * 2)If two objects have the same hashcode, they may or may not be equal,
	 * meaning, price of green apple and washington apple may varry
	 * */

}
