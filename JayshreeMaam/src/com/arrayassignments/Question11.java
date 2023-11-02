package com.arrayassignments;
//11.WAP to find and count total number of duplicate elements in an array.

import java.util.Scanner;

public class Question11 {
	
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
	
	public static void countDuplicate(int array[])
	{
		//int num[]= {1,2,3,4,5,6,7,2,3};
		
		for(int i=0;i<array.length;i++)
		{
			boolean isDuplicate=false;
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					isDuplicate= true;
					break;
				}
			}
			if(isDuplicate)
			{
				boolean isnotprinted=true;
				for(int k=i-1;k>=0;k--)
				{
					if(array[i]==array[k])
					{
						isnotprinted=false;
						break;
					}
				}
				if(isnotprinted)
				{
					System.out.println(array[i]+" is a duplicate");
				}
			}
		}
		
	}

	public static void main(String args[])
	{
		int array[]= arrayCreation();
		countDuplicate(array);
	}
}
