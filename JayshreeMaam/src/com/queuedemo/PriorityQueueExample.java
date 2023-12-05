package com.queuedemo;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String args[])
	{
		Queue<Integer> pq= new PriorityQueue<>();
		
		pq.add(23);
		pq.add(23);
		pq.add(199);
		pq.add(45);
		pq.add(-23);
	
		System.out.println(pq);
		System.out.println("Poll() removed head of queue"+pq.poll());
		System.out.println(pq);
		
		System.out.print("Remove() removed head of quque:"+pq.remove());
		System.out.println(pq);
		
		Iterator<Integer> i=pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Integer v;
		while((v=pq.poll()) !=null)
		{
			System.out.println("Elements:"+v);
		}
		
		Iterator<Integer> i2=pq.iterator();
		while(i2.hasNext())
		{
			System.out.println("Check elementsd:"+i2.next());
		}
		
	}

}
