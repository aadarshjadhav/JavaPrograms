package com.arrayassignments;
//12.	WAP to print all unique elements in the array.

import java.util.Scanner;

public class Question12 {
	
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
	
	public static void uniqueElements(int array[])
	{
		int count;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]=='$')
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					array[j]='$';
				}
			}
			if(count==1)
				System.out.println(array[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int array[]=arrayCreation();
		uniqueElements(array);
	}
}
