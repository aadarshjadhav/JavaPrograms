package com.exceptionassigngments;

public class TryFinallyOnly {
	
	public static void tryFinal(int b)
	{
		try
		{
			b=b/0;
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
