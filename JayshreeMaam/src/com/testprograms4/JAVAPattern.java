package com.testprograms4;

import java.util.Scanner;

public class JAVAPattern {
	
	public static void main(String[] args) 
	{
//		System.out.println("Enter the string:");
//		Scanner sc= new Scanner(System.in);
//		String str= sc.next();
		
	//	char array_str[]= str.toCharArray();
		char array_str[]= {'J','a','v','a'};
		for(int i=0;i<array_str.length;i++)
		{

				for(int j=0;j<=i;j++)
				{
					System.out.print(array_str[j]);
				}
				System.out.println();
		}
		
		for(int i=array_str.length-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(array_str[j]);
			}
			System.out.println();
		}
	}

}
