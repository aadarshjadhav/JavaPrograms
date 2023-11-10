package com.stringassignments;
//14.Write a Java program to count total number of words in a string.

public class Number_Of_Words {

	public static void main(String args[])
	{
		String str=" Hello World ";
		
		str=str.trim();
		char ch[]= str.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println("Number of words:"+count);
	}
}
