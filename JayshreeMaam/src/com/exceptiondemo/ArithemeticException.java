package com.exceptiondemo;

public class ArithemeticException {
	
	public void handleArithmeticException()
	{
		try 
		{
			int sum=10/0;
		}
		catch(ArithmeticException obj)
		{
			
			System.out.println("Arithmetic error!!");
			obj.printStackTrace();
		}
		finally
		{
			System.out.println("I am in fiinally");
		}
	}
	
	public static void main(String args[])
	{
		ArithemeticException e= new ArithemeticException();
	
		e.handleArithmeticException();
	}

}
