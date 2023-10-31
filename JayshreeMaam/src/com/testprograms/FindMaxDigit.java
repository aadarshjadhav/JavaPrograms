package com.testprograms;

public class FindMaxDigit {
	
	public static void main(String args[])
	{
		int num=345937;
		int remainder=0,largest=0;
	
		while(num>0)
		{
			remainder=num%10;
			if(largest<remainder)
			{
				largest=remainder;
			}
			num/=10;
		}
		System.out.println(largest);
	}
}
