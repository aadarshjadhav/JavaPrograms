package com.overriding;

public class Teenagers extends Kid {
	
	public Teenagers()
	{
		
	}
	
	public void readBook()
	{
		System.out.println("Inside Teenagers class methhod");
		
	}
	
	public static void main(String args[])
	{
	  Kid k1= new BigKid();
	  Kid k2= new Teenagers();
	  
	  k1.readBook();
	  k2.readBook();
	  
	}

}
