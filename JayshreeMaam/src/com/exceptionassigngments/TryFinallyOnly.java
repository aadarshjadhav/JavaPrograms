package com.exceptionassigngments;

public class TryFinallyOnly {
	
	public static void tryFinal(int b)
	{
		try
		{
			System.out.println("Before excepption");
			b=b/0;
			System.out.println("After exception");
		}
		finally
		{
			System.out.println("Inside fiinally block!!!");
		}
	}
	
	public static void main(String args[])
	{
		int b=10;
		tryFinal(b);
		
	}
}
