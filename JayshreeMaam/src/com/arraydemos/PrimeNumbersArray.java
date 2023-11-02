 package com.arraydemos;

import java.util.Scanner;

public class PrimeNumbersArray {
	
	public static int[] createArray()
	{
		int size;
		System.out.println(" Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		
		int num[]= new int[size];
		System.out.println(" Enter the elements in array:");
		for( int i=0; i<num.length;i++)
		{
			num[i]= sc.nextInt();
		}
		
		return num;
	}
	
	public static void checkPrime(int array[])
	{
		int count=0;
		System.out.println(" Prime numbers are: ");
		for(int i=0;i<array.length;i++)
		{
			count=0;
			for(int j=2; j<array[i];j++)
			{
				if(array[i]%j==0)
				{
					count++;
					//break;
				}
			}
			if(count==0)
			{
				System.out.print(" "+array[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		int arr[]= createArray();
		checkPrime(arr);
	}

}
