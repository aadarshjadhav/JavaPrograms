package com.testprograms6;

public class BookTest {
	
	public static void main(String[] args) 
	{
		Book b1 = new Book();                              
		b1.price = 500;                                      
		Book b2;                                              
		foo(b1);                                                                     
		b2 = b1;        
		
		System.out.println("b2:"+b2.price);
		
	}
	
	public static void foo(Book b1) 
	{    
			b1.price = 150;                 
			b1 = null ;                                                                                
	}

}
