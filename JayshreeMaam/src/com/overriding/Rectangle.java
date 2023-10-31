package com.overriding;

public class Rectangle extends Shape {
	int abc=12;
	public Rectangle()
	{
		
	}
	
	public void draw()
	{
		System.out.println("Inside Rectangle class methhod");
		System.out.println("Calling variable abc from Rectangle class:" +abc);
		System.out.println("Calling variable abc from Shape class:" +super.abc);
	}
	
	
	
	public static void main(String args[])
	{
		Shape s= new Rectangle();
		s.draw();
		s.area();
		
	}

}
