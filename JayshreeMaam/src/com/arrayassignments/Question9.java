package com.arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

//9.	WAP to put even and odd elements of array in two separate arrays.
public class Question9 {
	
	public static int[] arrayCreation()
	{
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		System.out.println("Enter 5 even and 5 odd elements:");
		int array[]= new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		return array;
	}
	
	public static void seperatingEvenOddArrays(int array[])
	{
		int even_array[]= new int[array.length/2]; //Doubt: wasting of memory
		int odd_array[]= new int[array.length/2];
			
		for(int i=0;i<=array.length;i++)
		{
			if(array[i]%2==0)
			{
				even_array[i]=array[i];
			}
			else
			{
				odd_array[i]=array[i];
			}
		}
		
		System.out.println("Showing elements of even array:");
		//for(int i=0;i<even_array.length;i++)
		//{
		//	if(even_array[i]!=0)
		//		System.out.print(" "+ even_array[i]);
			
		//}
		
		// Printing using Array toString()
		System.out.println(Arrays.toString(even_array));
		
		System.out.println("Showing elements of odd array:");
	/*	for(int i=0;i<odd_array.length;i++)
		{	
			if(odd_array[i]!=0)
				System.out.print(" "+ odd_array[i]);
		}
	*/	
		System.out.println(Arrays.toString(odd_array));
	}
	
	public static void main(String args[])
	{
		int array[]= arrayCreation();
		seperatingEvenOddArrays(array);
	}
}
