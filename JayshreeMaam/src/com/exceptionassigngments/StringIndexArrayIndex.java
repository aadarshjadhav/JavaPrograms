package com.exceptionassigngments;

//WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
//StringIndexOutOfBound) exception is generated and handle this exception

public class StringIndexArrayIndex {
	
	public static void checkIndexOutOfBound(int array[], String str)
	{
		int string_length=0;
		try
		{
			string_length=str.length();
			System.out.println("String length:"+str.charAt(7));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of Bound");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index out of Bound, string length:"+string_length);
		}
	}
	
	public static void main(String args[])
	{
		String str="Hello";
		int array[]= {1,2,3};
		checkIndexOutOfBound(array,str);
		
	}

}
