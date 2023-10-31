package com.overriding;

public class Ebay extends Company {
	
	public Ebay()
	{
		
	}
	
	public void address( String str)
	{
		System.out.println("Inside child class method");
	}
	
	public static void main(String args[])
	{
		Company c= new Ebay();
		c.address();
	}

}
