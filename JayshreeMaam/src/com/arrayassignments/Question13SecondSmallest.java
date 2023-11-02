package com.arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

// 13.	WAP to find the second smallest element in an array.
public class Question13SecondSmallest {
	
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

	public static void findSecondSmallest(int array[])
	{
		//Sorting and swapping logic
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Smallest second5 element:" + array[1]);
		
		//System.out.println("Second smallest element:" + second_min);
		//System.out.println(Arrays.toString(array));
	}
	
	public static void main(String args[])
	{
		int array[]=arrayCreation();
		findSecondSmallest(array);
	}
}
