package com.twodarrays;

public class MultiplicationOfTwoMatrix {
	
	public static int[][] multiplicationOfTwoMatrix(int array1[][], int array2[][])
	{
		
		int[] multi[]= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				multi[i][j]=0;
				for(int k=0;k<3;k++)
				{
					multi[i][j]=multi[i][j]+ array1[i][k]*array2[k][j];
					
				}
			}
		}
		return multi;
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
		int[] array1[]= {{1,2,3},{4,5,6},{7,8,9}};
		int[] array2[]= {{11,22,33},{44,55,66},{77,88,99}};
		int[] array3[]= new int[3][3];
		
		displayArray(array1);
		System.out.println();
		displayArray(array2);
		array3=multiplicationOfTwoMatrix(array1,array2);
		
		System.out.println();
		displayArray(array3);
		
		
	}

}
