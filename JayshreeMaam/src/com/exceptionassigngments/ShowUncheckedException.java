package com.exceptionassigngments;
//WAP to show unchecked exception

import java.lang.reflect.Array;
import java.util.Scanner;

public class ShowUncheckedException extends RuntimeException {
	
	public ShowUncheckedException()
	{
		
	}
	public static void showingUnchecked(int[] array) throws ArrayIndexOutOfBoundsException 
	{
		
		System.out.println("Enter the posistion you want to acess:");
		Scanner sc= new Scanner(System.in);
		int pos=sc.nextInt();
		
		if(pos>array.length-1)
			throw new ArrayIndexOutOfBoundsException();
		
	}
	
	public static void main(String args[])
	{
		int array[]= {1,2,3};
		
		showingUnchecked(array);
	}

}
