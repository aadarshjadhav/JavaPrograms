package com.arraydemos;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LessThanAvg {
	
	public static int[] arrayCreation()
	{
		int size;
		System.out.println("Enter the size of array:");
		Scanner sc=  new Scanner(System.in);
		size= sc.nextInt();
		
		int array[]= new int[size];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<array.length;i++)
		{
			array[i]= sc.nextInt();
		}
		
		return array;
	}
	
	public static void findlessthanavg(int array[])
	{
		double avg=ArrayBasics.printArrayAvg(array);
		
		System.out.println("Elements less than avg:"+avg);
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<avg)
			{
				System.out.println( array[i]);
			}
		}
	}
	
	public static void findNegative(int array[])
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				count++;
			}
		}
		System.out.println(" Number of negative elements in array:"+count);
	}
	
	public static void findMaxandMix(int array[])
	{
		int max=0, min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			else if(array[i]<min)
			{
				min=array[i];
			}
			
		}
		System.out.println("Max:"+max + " Min:"+min);
	}
	
	public static void main(String args[])
	{
		int array[]= arrayCreation();
		findlessthanavg(array);
		findNegative(array);
		findMaxandMix(array);
	}

}
