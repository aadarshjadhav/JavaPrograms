package com.exceptiondemo;

import java.io.IOException;

public class InheritenceExceptionA {
	
	public void shows() throws ArithmeticException,IOException,Exception
	{
		System.out.println("iNSIDE Parent class show()");
		int a=10;
		a=a/0;
	}
	
	public static void main(String args[])
	{
		
	}

}

class InheritenceException extends InheritenceExceptionA{
	
	public void shows() throws ArithmeticException, IOException, Exception
	{
		System.out.println();
		super.shows();
	}
	
	public static void main(String args[])
	{
		InheritenceException obj= new InheritenceException();
		try {
			obj.shows();
		}
		catch(Exception e)
		{
			
			
		}
		
	}

}
