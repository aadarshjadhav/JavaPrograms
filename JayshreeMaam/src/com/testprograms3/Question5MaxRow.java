package com.testprograms3;

import java.lang.reflect.Array;

public class Question5MaxRow {
	
	public static void main(String args[])
	{
		int array[][]= {{22, 31, 9,45}, {12, 25, 16,46}} ;
		int max_in_row[]=new int[array.length];
		int temp;
		for(int i=0;i<array.length;i++)
		{
			int max=0;
			for(int j=0;j<array[0].length;j++)
			{
				if(array[i][j]>=max)
				{
					max=array[i][j];
				}
			}
			max_in_row[i]=max;
		}
		
		System.out.println("Max arrays before sorting");
		for(int i=0;i<max_in_row.length;i++)
		{
			System.out.print(max_in_row[i]+" ");
		}
		
		System.out.println();
		System.out.println("Max arrays After sorting");
		for(int i=0;i<max_in_row.length;i++)
		{
			for(int j=0;j<max_in_row.length;j++)
			{
				if(max_in_row[i]>max_in_row[j])
				{
					temp=max_in_row[i];
					max_in_row[i]=max_in_row[j];
					max_in_row[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<max_in_row.length;i++)
		{
			System.out.print(max_in_row[i]+" ");
		}
	
	}

}
