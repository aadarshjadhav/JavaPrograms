package com.overriding;

public class Sqaure extends Shape{
	
	public Sqaure()
	{
		
	}
	
	public void draw()
	{
		System.out.println("Inside Sqaure class methhod");
	}
	
	public static void main(String args[])
	{
		Shape s= new Circle();
		s.draw();
		s.area();
		
		
	}

}
