package com.exceptionassigngments;

public class ArrayIndexOutBoundsExceptionCatch {
	
	
	public static void main(String args[])
	{
		int[] array= {1,2,3,4};
		
		try
		{
			System.out.println(array[5]);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic error!!");
			e.printStackTrace();
		}
		
	}

}
