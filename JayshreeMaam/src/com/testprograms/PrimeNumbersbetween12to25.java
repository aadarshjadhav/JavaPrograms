package com.testprograms;

public class PrimeNumbersbetween12to25 {
	
	public static void main(String args[])
	{
		int count=0;
		for(int i=13;i<50;i++)
		{
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(" "+i);
			}
			count=0;
		}
	}
}
