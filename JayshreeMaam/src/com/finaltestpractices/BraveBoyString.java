package com.finaltestpractices;

import java.util.Scanner;

public class BraveBoyString {
	
	public static void main(String args[])
	{
		System.out.println("Enter the string:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		String str_array[]=str.split(" ");

		for(int k=0;k<str_array.length;k++)
		{
			char ch[]= str_array[k].toCharArray();

			for(int i=0;i<ch.length;i++)
			{
				for(int j=0; j<=i ; j++)
				{
					System.out.print(ch[j]);
				}
			}
			System.out.print(" ");
		}
	}
}
