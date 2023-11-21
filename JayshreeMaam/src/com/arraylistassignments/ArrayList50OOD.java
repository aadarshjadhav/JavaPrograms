package com.arraylistassignments;

import java.util.ArrayList;

//Create aarraylist of integers. Add first 50 odd numbers to arraylist.

public class ArrayList50OOD {
	
	public static void main(String args[])
	{
		ArrayList<Integer> array50ood= new ArrayList<>();
		int count=0;
		int i=1;
		while(true)
		{
			if(count<50)
			{
				count++;
				
				array50ood.add(i);
				i=i+2;
			}
			else
				break;
		}
		System.out.println(array50ood);
	}
}
