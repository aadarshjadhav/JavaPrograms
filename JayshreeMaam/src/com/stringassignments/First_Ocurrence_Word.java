package com.stringassignments;
//15.Write a Java program to find first occurrence of a word in a given string.

import java.util.Scanner;

public class First_Ocurrence_Word {
	
	public static void main(String args[])
	{
		
		String str= "Sam is a boy and he is a good boy";
		System.out.println("The index of wrod is:"+ str.indexOf("is"));
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word:");
		String word=sc.next();
		
		for(int i=0;i<str.length(); i++)
		{
			String temp="";
			int j;
			
			for(j=i;j<str.length() && str.charAt(j)!=32;j++ )
			{
				temp+=str.charAt(j);
			}
			if(temp.equals(word))
			{
				System.out.println(" The index of the word is:" + (j-temp.length()));
				break;
			}
		}
	}

}
