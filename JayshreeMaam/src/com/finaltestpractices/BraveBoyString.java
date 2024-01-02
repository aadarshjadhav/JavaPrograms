package com.finaltestpractices;

import java.util.Scanner;

public class BraveBoyString {
	
	public static void main(String args[])
	{
		System.out.println("Enter the string:");
//		Scanner sc= new Scanner(System.in);
//		String str=sc.next();
		
		String str="Brave Boy";
		
		String str_array[]=str.split(" ");
		
		
		
		char ch1[]= str_array[0].toCharArray();
		
		for(int i=0;i<ch1.length;i++)
			for(int j=0; j<=i ; j++)
				System.out.print(ch1[j]);
		
		System.out.print(" ");
		char ch2[]=str_array[1].toCharArray();
		for(int i=0;i<ch2.length;i++)
			for(int j=0; j<=i ; j++)
				System.out.print(ch2[j]);
	}

}
