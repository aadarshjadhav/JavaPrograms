package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArrayList2 {
	
	public static void main(String args[])
	{

		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(11);
		l1.add(12);
		l1.add(11);
		l1.add(1);
		l1.add(4);
		
		//Object[] arr= l1.toArray();
		
		Integer array[]=l1.toArray(new Integer[l1.size()]);
		System.out.println(Arrays.toString(array));
		
		int sum=0;
		//1 traditional
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i)+ " ");
			sum=sum+l1.get(i);
		}
		
		System.out.println(sum);
		sum=0;
		System.out.println();
		System.out.println("_____________________________");
		
		//2 enhanced for loop
		for(int i:l1)
		{
			System.out.print(i+ " ");
			sum=sum+i;

		}
		System.out.println(sum);
		sum=0;
		
		//3 Iterator way
		Iterator<Integer> itr=l1.iterator(); //Using this statement to reset the position of iterator
		while(itr.hasNext())
		{
			//System.out.println(itr.next()+" ");
			sum=sum+itr.next();
		}
		System.out.println(sum);
		
		List<Integer> l= Arrays.asList(1,2,3,4,5,6);
		ArrayList<Integer> l3= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(l3);
	}

}
