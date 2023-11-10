package com.stringassignments;
//12.Write a Java program to count occurrences of a character in given string.

public class LastOccurence {
	
	public static void main(String args[])
	{
		String str= "Hello$World";
		int count_occurrence=0;
		
		//Logic through
		char c[]= str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='l')
			{
				count_occurrence++;
			}
		}
		System.out.println(" Number of occurrences of 'l' character:"+count_occurrence);
	}
	
	

}
