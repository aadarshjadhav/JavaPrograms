package com.exceptionassigngments;

import java.util.Arrays;

public class ArrayIndexOutBoundsExceptionThrow extends RuntimeException //Here two ways, Exception and Runtime Excecption, Depending upon which you use, you need to handle it accordingly
{
	//If Exception way is used, you need to handle it in main method.
	//If RuntimeException is used, you don't need to handle in main method
	
	int array[];
	public ArrayIndexOutBoundsExceptionThrow()
	{
		
	}
	
	public ArrayIndexOutBoundsExceptionThrow(int array[])
	{
		this.array=array;
	}
	
	public String toString()
	{
		return "ArrayIndexOutBoundsExceptionThrow"+ Arrays.toString(array);
	}

}
