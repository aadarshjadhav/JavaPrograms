package com.exceptionassigngments;

import java.util.Scanner;

public class Array {
	
	public void checkArrayIndex(int array[]) throws ArrayIndexOutBoundsExceptionThrow
	{
			
		System.out.println("Enter the position you waant to access:");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i>array.length-1)
			throw new ArrayIndexOutBoundsExceptionThrow(array);
	}
	
	public static void main(String args[]) 
	{
		int array[]= {1,2,3,4};
		Array a= new Array();
		a.checkArrayIndex(array);
	}

}
