package com.twodarrays;

import java.util.Scanner;

public class TwoDarraysDemo {
	
	public static void TwoDArrays()
	{
		int array[][]= new int[3][];
		
		array[0]= new int[3];
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		
		array[1]= new int[3];
		array[1][0]=4;
		array[1][1]=5;
		array[1][2]=6;
		
		array[2]= new int[3];
		array[2][0]=7;
		array[2][1]=8;
		array[2][2]=9;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j] +"\t");
			}
			System.out.println();
		}
	}
		public static void createArrayUserdefinedValues()
		{
			System.out.println("Enter the row size:");
			Scanner sc= new Scanner(System.in);
			int row_size= sc.nextInt();
			
			int array2[][]= new int[row_size][];
			
			for(int i=0;i<array2.length;i++)
			{
				System.out.println("Enter the column size of:"+ (i+1)+"th");
				int column_size= sc.nextInt();
				array2[i]= new int[column_size];
				
				for(int j=0;j<array2[i].length;j++)
				{
					System.out.println("Enter the elements in columns:");
					int element=sc.nextInt();
					array2[i][j]=element;
				}
			}
			
			for(int i=0;i<array2.length;i++)
			{
				for(int j=0;j<array2[i].length;j++)
				{
					System.out.print(array2[i][j] +"\t");
				}
				System.out.println();
			}
			
			//Enhanced for loop for 2D Array
			for(int i[]: array2)
			{
				for(int element: i)
				{
					
				}
			}
		
		}
	
	
	public static void main(String args[])
	{
		TwoDArrays();
		createArrayUserdefinedValues();
		
	}
	
}
