package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {
	
	public static void main (String args[])
	{
		ArrayList<Student> list= new ArrayList<>();


		list.add(new Student(12,"Jayshree"));
		list.add(new Student(4,"Medha"));
		list.add(new Student(3,"Adarsh"));
		list.add(new Student(7,"Prashant"));
		
		Iterator<Student>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("________________________________________");
		
		itr=list.iterator();
		while(itr.hasNext())
		{
			Student obj= itr.next();
			if(obj.getName().length()>=7)
			{
				System.out.println(obj);
			}
		}
	}

}
