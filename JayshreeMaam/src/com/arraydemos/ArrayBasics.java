package com.arraydemos;

import java.util.Scanner;

public class ArrayBasics {
	
	public static void showElement(int num[])
	{
		for(int e:num)
			System.out.println(e+" ");
		
	}
	
	//Creating an array
	public static int[] createArray()
	{
		int num[];
		
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		
		int size= sc.nextInt();
		num=new int[size];
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter the elements in array:");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	
	//Sum of array
	public static void sumOfArray(int array[])
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println("Sum of elements:"+sum);
	}
	
	//Prinnting array in reverse
	public static void printArrayReverse(int array[])
	{
		System.out.println("Array printing is reverse: ");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(" " +array[i]);
		}
		System.out.println();
		
	}
	
	public static void printArrayEven(int array[])
	{
		System.out.println("Even elements:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
	}
	
	public static void printArrayOdd(int array[])
	{
		System.out.println("Odd elements:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
	}
	
	public static double printArrayAvg(int array[])
	{
		int sum=0;
		double avg=0;
		System.out.println("Avg of elements:");
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		
		//System.out.println();
		avg=sum/array.length;
		System.out.print(" "+avg);
		return avg;
	}
	
	public static void printDivisibleby2and3(int array[])
	{
		System.out.println("Elememnts divisible by 2 and 3:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0 && array[i]%3==0)
			{
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int arr[]=createArray();
		showElement(arr);
		sumOfArray(arr);
		printArrayReverse(arr);
		printArrayEven(arr);
		printArrayOdd(arr);
		printArrayAvg(arr);
		printDivisibleby2and3(arr);
		
	}

}
