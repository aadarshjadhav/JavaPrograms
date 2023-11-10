package com.stringassignments;
//13.  Write a Java program to trim leading white space characters in a string.

public class TrimLeandingSpaceCharacters {
	
	public static void main(String args[])
	{
		String str= " Hello World! ";
		//str=str.trim();
		
		//System.out.println(str);
		
		//Trimming leading spaces
		
		int j=0;
		
		while(j<str.length() && str.charAt(j)==32)
		{
			j++;
		}
		str= str.substring(j,str.length());
		System.out.println(str);
		
		//using array of characters
//		char c[]= str.toCharArray();
//		char c2[]= new char[c.length];
//		
//		for(int i=0;i<c.length;i++)
//		{
//			if(c[0]==' ')
//			{
//				continue;
//			}
//			else
//			{
//				c 
//			}
//		}
		
	}

}
