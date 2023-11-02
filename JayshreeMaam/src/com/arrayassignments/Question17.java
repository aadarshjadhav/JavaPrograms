package com.arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

/*17.	WAP to reverse the array itself, don’t print array in reverse – 
 * I want current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
 * so your same array must be [78, 37, 29, 45, 90, 3] 
 * without using temporary array.*/
public class Question17 {
	
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
		
		public static int[] reverseArrayposition(int array[])
		{
			int temp=0;
			for(int i=0;i<array.length/2;i++)
			{
				int j=array.length-1-i;
				
				while(j>=array.length/2)
				{	
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					break;
				}
			}
			//System.out.println("Array After Reversing:"+Arrays.toString(array));
			return array;
		}
		
		public static void main(String args[])
		{
			int array[]= arrayCreation();
			array=reverseArrayposition(array);
			System.out.println("Array After Reversing:"+Arrays.toString(array));
			System.out.println("Array firt element: "+ array[0]);
			
		}
}
