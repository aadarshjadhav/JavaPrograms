package com.stringassignments;

import java.util.Scanner;

public class All_Occurrence_Of_a_Characater {
	
	public static void main(String args[])
	{
		System.out.println("Enter the chacter:");
		Scanner sc= new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
		
		String str="The is a monster";
		char strarray[]=str.toCharArray();
		int count=0;
		for(int i=0;i<strarray.length;i++)
		{
			if(ch==strarray[i])
			{
				count++;
			}
		}
		System.out.println("Number of occurrences of: " +ch+ " is "+ count);
		
	}

}
