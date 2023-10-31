package com.overriding;

public class BigKid extends Kid {
	
	public BigKid()
	{
		
	}
	
	public void readBook()
	{
		System.out.println("Inside BigKid Class method");
		
	}
	
	public static void main(String args[])
	{
		Kid k= new BigKid();
		k.readBook();
		((Kid)k).readBook();;
		
		BigKid bk= new BigKid();
		bk.readBook();
		
		Kid k2= new BigKid();
		
			
	}

}
