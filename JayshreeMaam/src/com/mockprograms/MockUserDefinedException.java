package com.mockprograms;

import com.exceptiondemo.ArithemeticException;

public class MockUserDefinedException extends Exception {
	
	int d;
	
	public MockUserDefinedException(int d)
	{
		this.d=d;
		System.out.println("Inside constructor!");
	}
	
	public String toString()
	{
		return "Wrong Denominator:"+d;
	}

}
