package com.arrayassignments;

import java.lang.reflect.Array;

public class Sorting {
	
	public static void sortingArray(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			
				System.out.print(" "+array[i]);
		}
	}
	
	public static void main(String args[])
	{
		int array[]= {2,4,6,1,5};
		sortingArray(array);
	}
	
	

}
