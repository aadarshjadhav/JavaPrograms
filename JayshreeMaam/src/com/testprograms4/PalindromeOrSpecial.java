package com.testprograms4;

import java.util.Scanner;

public class PalindromeOrSpecial {
	
	public static void main(String args[])
	{
//		System.out.println("Enter the String:");
//		Scanner sc= new Scanner(System.in);
//		String str=sc.next();
		
		String str="COMIC";
		
		boolean is_palindrome=true;
		boolean is_special=false;
		
		char array_str[]= str.toCharArray();
		
		if(array_str[0]==array_str[array_str.length-1])
		{
			is_special=true;
		}
		
		for(int i=0;i<array_str.length/2;i++)
		{
			if(array_str[i]== array_str[array_str.length-1-i])
			{
				continue;
			}
			else
			{
				is_palindrome=false;
				break;
			}
		}
		
		if(is_palindrome==true && is_special==true)
		{
			System.out.println("The string:"+str+ " is both spcial and palindrome!");
		}
		else if(is_palindrome==true && is_special==false)
		{
			System.out.println("The string:"+str+ " is palindrome only!");
		}
		else if(is_palindrome==false && is_special==true)
		{
			System.out.println("The string:"+str+ " is Special!");
		}
		else 
		{
			System.out.println("The string:"+str+ " is not Special nor palindrome");
			
		}
		
		
	}

}
