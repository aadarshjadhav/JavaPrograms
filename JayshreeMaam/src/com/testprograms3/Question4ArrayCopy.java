package com.testprograms3;

public class Question4ArrayCopy {
	
	public static void main(String args[])
	{
		int array[][]={{1,2,3,4},{5,6,7,8}};
		int array2[][]= new int[array.length][array[0].length];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				array2[i][array[0].length-1-j]= array[i][j];
			}
		}
		
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array2[0].length;j++)
			{
				System.out.print(" "+ array2[i][j]);
			}
			System.out.println();
		}
	}
		
}

