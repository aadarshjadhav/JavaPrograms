package com.stringassignments;
//26.Write a Java program to find last occurrence of a character in a given string

public class Last_Occurrence_of_Character {
	
	public static void main(String args[])
	{
		String str="Java is java";
		char ch1[]=str.toCharArray();
		char ch='a';
		
		for(int i=ch1.length-1;i<ch1.length;i--)
		{
			if(ch==ch1[i])
			{
				System.out.println(i);
				break;
			}
		}
	}

}
