package com.queuedemo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueStudent {
	
	public static void main(String args[])
	{
		Queue<Student> pq=new PriorityQueue<>();
		
		pq.add(new Student("Aadarsh",1));
		pq.add(new Student("Jayraj",4));
		pq.add(new Student("Rohit",3));
		pq.add(new Student("Abhishek",2));
		
		Iterator<Student> i=pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		StudentComparatorName compname= new StudentComparatorName();
		
		Queue<Student> pqcompnames=new PriorityQueue<>(compname); //Mind, we have to tell the Pirority to to use comparator,
																	//Then add elements to prioritiy Queue, this same concept applies for TreeSet
		
		pqcompnames.add(new Student("Aadarsh",1));
		pqcompnames.add(new Student("Jayraj",4));
		pqcompnames.add(new Student("Rohit",3));
		pqcompnames.add(new Student("Abhishek",2));
		pqcompnames.add(new Student("Maroti",6));
		
		//Iterating
		System.out.println("_________By usiing Iterator method________");
		Iterator<Student> itr=pqcompnames.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("_________By using poll method____________");
		while(pqcompnames.poll()!=null)
		{
			System.out.println("Polling:"+pqcompnames.poll());
		}
		
		
	}

}
