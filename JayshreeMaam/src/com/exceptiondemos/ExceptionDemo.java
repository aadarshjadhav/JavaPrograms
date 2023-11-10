package com.exceptiondemos;

public class ExceptionDemo {
	
	public static void main(String args[])
	{	
		try {
				int a[]= new int[2];
				System.out.println("Access element three:"+ a[3]);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Thrown: "+e);
		}
		System.out.println("Out of block");
	}
}
