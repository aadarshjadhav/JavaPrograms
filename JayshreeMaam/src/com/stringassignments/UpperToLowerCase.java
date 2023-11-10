package com.stringassignments;

import java.util.Arrays;

/// Write a Java program to convert uppercase string to lowercase.
public class UpperToLowerCase {
	
	public static void main(String args[])
	{
		String str="There is a monster";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
	
			if(ch[i]>='A' && ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);	
		}
		
		System.out.println(Arrays.toString(ch));
	
	}

}
