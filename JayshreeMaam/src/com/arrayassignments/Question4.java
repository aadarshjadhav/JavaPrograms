package com.arrayassignments;

import java.util.Scanner;

public class Question4 {
	
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
	
	public static int[] copyArray(int array[])
	{
		int array2[]=new int[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			array2[i]=array[i];
		}
		return array2;
	}
	
	public static void showElements(int array[])
	{
		System.out.println("Elements in array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void main(String args[])
	{
		int array[]=arrayCreation();
		showElements(array);
		int array2[]=copyArray(array);
		showElements(array2);
	}

}
