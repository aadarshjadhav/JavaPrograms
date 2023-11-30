package com.mockprograms;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[])
	{
		int a=0,c=0;
		int b=10;
		
		try
		{
			System.out.println("Enter the denominator:");
			Scanner sc= new Scanner(System.in);
			int denom=sc.nextInt();
			if(denom==0)
			{
				throw new MockUserDefinedException(denom);
			}
		}
		catch(MockUserDefinedException e)
		{
			System.out.println("User defined excecption occurred"+e);
		}
	}
	

}
