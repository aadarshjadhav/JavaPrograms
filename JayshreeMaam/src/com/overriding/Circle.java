package com.overriding;

public class Circle extends Shape {

	public Circle()
	{
		
	}
	
	public void draw()
	{
		System.out.println("Inside Circle class methhod");
	}
	
	public static void main(String args[])
	{
		Shape s= new Sqaure();
		s.draw();
		s.area();
		
		
	}
}
