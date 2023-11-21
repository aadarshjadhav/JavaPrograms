package com.exceptionassigngments;
//4. WAP to show checked exception and use multiple catch block with universal Exception handler.

public class MultipleCatchUniversalException {
	
	
	public void catchUniversalException(int b)
	{
		try
		{
			b=b/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception !!!");
		}
		catch(Exception e)
		{
			System.out.println("Universal Exception !!!");
		}
		catch(Throwable e)
		{
			System.out.println("Throwable Exception!!!");
		}
	}
	public static void main(String args[])
	{
		
		MultipleCatchUniversalException me= new MultipleCatchUniversalException();
		int b=10;
		
		me.catchUniversalException(b);
	}

}
