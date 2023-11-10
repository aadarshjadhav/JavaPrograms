package com.twodarrays;

import java.util.Arrays;

public class AdditonOf2Matrix {
	
	public static int[][] additionOfTwoMatrix(int array1[][], int array2[][])
	{
		
		int[] sum[]= new int[array1.length][array2[0].length];
		
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				
				sum[i][j]= array1[i][j]+array2[i][j];
				
			}
		}
		return sum;
	}
	
	public static void displayArray(int array[][])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int[] array1[]= {{1,2,3},{4,5,6}};
		int[] array2[]= {{1,2,3},{4,5,6}};
		int[] arraysum[];
		
		arraysum=additionOfTwoMatrix(array1, array2);
		displayArray(arraysum);
		
	}

}
