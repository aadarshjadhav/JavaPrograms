package com.exceptionassigngments;
//WAP to check can we have a catch with no parameters?

public class EmptyCatch {
	
	public void emptyCatch()
	{
		int b=10;
//		try
//		{
//			b=b/0;
//		}
//		catch()
//		{
//			//System.out.println("Inside catch");
//		}
	}
	
	public static void main(String args[])
	{
		EmptyCatch ec= new EmptyCatch();
		ec.emptyCatch();
	}
}
