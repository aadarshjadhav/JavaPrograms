package com.stringassignments;
//30. Write a Java program to remove first occurrence of a character from string.

import java.util.Arrays;

public class Remove_First_Occurrence {
	
	public static void main(String args[])
	{
		String str="HelloWorld";
		char ch1[]=str.toCharArray();
		char ch[]= new char[str.length()-1];
		
		int index=str.indexOf('l');
	
		ch1[index]=' ';
		
		System.out.println(Arrays.toString(ch1));
	}

}
