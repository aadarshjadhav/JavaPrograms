package com.finaltestpractices;

public class DuplicateValueException extends Exception {
	
	int digit;
	public DuplicateValueException(String s, int digit)
	{
		
		super(s);
		this.digit=digit;
		
	}
	@Override
	public String toString() {
		return "To String DuplicateValueException [digit=" + digit + "]";
	}
	
	

}
