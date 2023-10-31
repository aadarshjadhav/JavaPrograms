package com.overriding;

public class Kid {
	
	int bookid;
	String name;
	
	public Kid()
	{
		
	}
	public void readBook()
	{
		System.out.println("Inside Parent class method");
	}
	
	public void readBook(int bookid,String name)
	{
		
		this.bookid=bookid;
		this.name=name;
	}
	
	public String toString()
	{
		return "Bookid:"+bookid+ "Name:"+name;
	}
	
	public static void main(String args[])
	{
		Kid d= new Kid();
		d.readBook(1, "Oliver Twist");
		System.out.println(d);
	}
	

}
