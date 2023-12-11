package com.testprograms6;
/*
 * 0123
 * 456
 * 78
 * 9
 */


public class StringPattern {
	
	public static void main(String args[])
	{
		int count=0;
		
		for(int i=0;i<4;i++)
		{
			for(int j=4-i;j>0;j--)
			{
				
				System.out.print(count);
				++count;
			}
			System.out.println();
		}
	}

}
