package com.arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {
	
/*	public static int[] arrayCreation()
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
*/
	
	public static void combine2ArrayAlternatively()
	{
//1st	int n1[]= {1,2,3,4,5};
//		int n2[]= {11,22,33,44,55};
		
		int n1[]= {1,2,3};
		int n2[]= {4,5,6};
		

		int n3[]=new int[n1.length+n2.length];
		//int k=0;
		for(int i=0;i<n1.length;i++)
		{
			for(int j=i;j<n2.length;)
			{
				n3[i+j]=n1[i];
				n3[i+j+1]=n2[i];
				break;
			}
			
		}
		System.out.println("Array:"+Arrays.toString(n3));
	}
	
	public static void main(String args[])
	{
		combine2ArrayAlternatively();
		
	}

}
