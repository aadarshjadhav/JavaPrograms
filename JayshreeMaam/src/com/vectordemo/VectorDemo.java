package com.vectordemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/*
 * vector is a legacy class
 * it's underlying data structures is growable
 * default capacity 10
 * it increases it's size by by double capacity
 * vector is thread safe, unlike array(where one thread can only access data)
 * all methods in vector are synchronized, it gives thread safety
 	3 type of cursor: 1. Iterator-Universal Cursor(iterator method is in collection interface and hence this cursor can be used in all collections)
 * 					  2. ListIterator-only used in list specific classes
 * 					  3. Enumeration-it is available in only legacy classes vectorclasssname.elements() 
 * 						 it gives enumeration cursor(Fail-safe)

 */

public class VectorDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> array_list = new ArrayList<>();
		array_list.add("Sadhu");
		array_list.add("Madhu");
		array_list.add("Anil");
		array_list.add("Sanju");
		array_list.add("Vaishu");
		
	
		ArrayList<Trainer> trainer_list= new ArrayList<>();
		trainer_list.add(new Trainer("Medha",10,"B.E"));
		trainer_list.add(new Trainer("Kirt",18,"B.E"));
		trainer_list.add(new Trainer("Jayshree",5,"B.E"));
		
		/*Ways to construct vector
		 * 1. default constructor
		 * 2. constructor taking Collection extending String type parameter
		 * 3. constructor taking Collection of custom type parameter
		 */
		
		Vector<String> v=new Vector<>(array_list);
		Vector<Trainer> v1= new Vector<>(trainer_list);
		
		for(Trainer t:trainer_list)
			System.out.println(t);
		
		Vector<String> v3= new Vector<>(20);
		//Vector<String> v4 = new Vector<>(20);// we can set initial capacity to vector
		
		System.out.println("Capacity:"+v.capacity());
		v3.add("A");
		v3.add("Z");
		v3.add("Y");
		v3.add("C");
		
		
		System.out.println("Size:"+v.capacity());
		System.out.println(v);
		
		Enumeration<String> cursor= v3.elements();
		
		while(cursor.hasMoreElements())
			System.out.println(cursor.nextElement());
		
		
		
		/*System.out.println(v.addAll(array_list)); //return boolean
		System.out.println(v);*/
		
		/*v.addAll(1, aarray_list);
		System.out.println(v);*/
		
		/*v.add(2, "W");
		System.out.println(v);*/
		
		System.out.println(v.firstElement());//returns object at index 0
		System.out.println(v.lastElement());//returns object at index v.size()-1
		//setElementAt, removeElementAt

	}
}
