package com.arrayassignments;

import java.util.Scanner;

/*WAP to search for a given number in an array and accordingly print the index if exists.*/

public class Question3 {
	
	public static int[] arrayCreation()
	{
		int size;
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		size= sc.nextInt();
		
		int array[]= new int[size];
		System.out.println(" Enter the elements in array:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		return array;
	}
	
	public static void checkIndex(int array[])
	{
		int num;
		System.out.println("Enter the number to get it's index:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				System.out.println("The index of that element is:"+ i);
			}
		}
	
	}
	
	public static void main(String args[])
	{
		int array[]= arrayCreation();
		checkIndex(array);
	}
}
