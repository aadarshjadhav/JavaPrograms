package com.exceptionassigngments;
//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
import java.util.Scanner;

public class MultipleExceptions {
	
	public void multipleExceptions(int array[], int b)
	{
		try
		{
			System.out.println("Enter the position you want to print");
			Scanner sc= new Scanner(System.in);
			int i=sc.nextInt();
			
			try 
			{
				int sum=array[i]/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception!!!");
				e.printStackTrace();
			}
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Array index out of bound exception!!!");
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		int array[]= {1,2,3,4};
		MultipleExceptions me= new MultipleExceptions();
		int b=10;
		
		me.multipleExceptions(array,b);
		
	}

}
