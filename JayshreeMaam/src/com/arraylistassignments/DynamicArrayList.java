package com.arraylistassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Show in program, that size of an arraylist dynamically changes

public class DynamicArrayList {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> arraydynamic= new ArrayList<>();
		arraydynamic.add(sc.nextInt());
		
		while(true)
		{
	
			System.out.println("Enter the element you want to add:");
			arraydynamic.add(sc.nextInt());
			System.out.println("Do you want to enter more elements:");
			char ch=sc.next().charAt(0);
			if(ch=='y')
				continue;
			else
				break;
			
		}
		
		System.out.println(arraydynamic);
//		Integer array[]=arraydynamic.toArray(new Integer[arraydynamic.size()]);
//		System.out.println(Arrays.toString(array));
		
			
	}

}
