package com.arrayassignments;

import java.util.Scanner;

//14.WAP to count frequency of each element in an array.

public class Question14 {
	
	public static int[] arrayCreation()
	{
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		System.out.println("Enter elements:");
		int array[]= new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		return array;
	}
	
	public static void checkFrequency(int array[])
	{
		int count;
		for(int i=0;i<array.length;i++)
		{
			boolean is_number_present=false;
			count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					is_number_present= true;
					count++;
				}
			}
			
			if(is_number_present)
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
					System.out.println(array[i]+" element has:"+ count+ "frequency");
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		int array[]= arrayCreation();
		checkFrequency(array);
	}

}
