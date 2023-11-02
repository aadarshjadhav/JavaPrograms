package com.arrayassignments;

import java.util.Scanner;

//WAP to print reverse of an array. Also print every alternate element backwards
public class Question5 {
	
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
	
	public static void alternateReverse(int array[])
	{
		System.out.println("Alternative reverse of elements:");
		for(int i=array.length-1; i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.print(" "+array[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		int array[]=arrayCreation();
		alternateReverse(array);
		
	}
}
