package com.twodarrayassignments;

public class Qestion3 {
	
	public static void rowMaximum(int array[][])
	{
		int max=0;
		for(int i=0;i<3;i++)
		{
			max=0;
			for(int j=0;j<3;j++)
			{
				if(array[i][j]>max)
				{
					max=array[i][j];
				}
			}
			System.out.println(max);
		}
	}
	
	public static void columnMinimum(int array[][])
	{
		int mini=0;
		for(int i=0;i<3;i++)
		{
			mini=array[0][i];
			for(int j=0;j<3;j++)
			{
				if(array[j][i]<mini)
				{
					mini=array[j][i];
				}
			}
			
			System.out.println(mini);
		}
	}
	
	public static void sumColumnRow(int array[][])
	{
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				sum+=array[i][j];
			}
			System.out.println("Sum of row "+(i+1)+ " is "+sum);
		}
		
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				sum+=array[j][i];
			}
			System.out.println("Sum of column "+(i+1)+ " is "+sum);
		}
	}
	
	public static void sumDiagonal(int array[][])
	{	
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum+=array[i][j];
				}
			}
		}
		System.out.println("Sum of Diagonal elements are:"+sum);
	}
	
	public static void sparseMatrix(int array[][])
	{
		int count_zeroes=0, count_non_zeroes=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(array[i][j]==0)
				{
					count_zeroes++;
				}
				else
				{
					count_non_zeroes++;
				}
			}
		}
		
		if(count_zeroes>count_non_zeroes)
		{
			System.out.println("Yes the matix is sparse matrix");
			System.out.println("No of zeros:"+count_zeroes);
			System.out.println("No of non-zeros:"+count_non_zeroes);
		}
		else
		{
			System.out.println("No the matix is sparse matrix");
			System.out.println("No of zeros:"+count_zeroes);
			System.out.println("No of non-zeros:"+count_non_zeroes);
		}
	}
	
	public static void transposeMatrix(int array[][])
	{	
		int temp= 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					temp=array[i][j+1];
					array[i][j+1]=array[i+1][j];
					array[i+1][j]=temp;
					break;
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void displayArray(int array[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int[] array[]= {{1,2,3},{4,5,6},{7,8,9}};
		//rowMaximum(array);
		//columnMinimum(array);
		
		//sumColumnRow(array);
		//sumDiagonal(array);
		//sparseMatrix(array);
		transposeMatrix(array);
		//displayArray(array);
	}

}
