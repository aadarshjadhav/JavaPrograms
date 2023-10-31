package com.arraydemos;

import java.util.Scanner;

public class SumOfArray {
	
	public static void showElement(int num[])
	{
		for(int e:num)
			System.out.println(e+" ");
		
	}
	
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
	
	
	public static void main(String args[])
	{
		int arr[]=createArray();
		showElement(arr);
	}

}
