package com.arrayassignments;
/*7.	WAP to insert an element in a specific position into an array.*/

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
	
	public static int[] arrayCreation()
	{
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		System.out.println("Enter the elements:");
		int array[]= new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		return array;
	}
	
	public static int[] insertElement(int array[])
	{
		System.out.println("Enter the position you wannt to insert:");
		Scanner sc= new Scanner(System.in);
		int position= sc.nextInt();
		
		System.out.println("Enter the new element you want to insert:");
		int new_element=sc.nextInt();
		
		array[position-1]=new_element;

		return array;
	}
	
	public static int[] shiftingElement(int array[])
	{
		int new_array[] = new int[array.length+1];
		
		System.out.println("Enter the position you want to insert:");
		Scanner sc= new Scanner(System.in);
		int position= sc.nextInt();
		
		System.out.println("Enter the element you want to insert:");
		int new_element= sc.nextInt();
		
		//WithOUT Position-1 logic
/*		for(int i=0;i<position;i++)
		{
			new_array[i] = array[i];
		}
		
		new_array[position]= new_element;
		
		for(int i=position;i<array.length;i++)
		{
			new_array[i+1] = array[i];
		}
*/		
		//With Position-1 logic
		for(int i=0;i<position-1;i++)
		{
			new_array[i] = array[i];
		}
		
		new_array[position-1]= new_element;
		
		for(int i=position-1;i<array.length;i++)
		{
			new_array[i+1] = array[i];
		}
		return new_array;
		
	}
	
	public static void showElements(int array[])
	{
		System.out.println("Elements in array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
	}
	
	
	
	public static void main(String args[])
	{
		int array[]= arrayCreation();
		//showElements(array);
		//insertElement(array);
		//showElements(array);
		int new_array[]=shiftingElement(array);
		showElements(new_array);
		System.out.println();
		System.out.println(Arrays.toString(new_array));
		
	}

}
