package com.interfacedemos;

public class Circle extends Shape {
	
	double r;
	final double pi=3.14;
	double result;
	
	public Circle (double r)
	{
		this.r=r;
	}
	
	@Override
	public double calculateArea()
	{
		
		result =pi*r*r;
		return pi*r*r;
	}
	
	public String toString()
	{
		return " Circle Radius:"+r;
	}
	
	public static void main(String args[])
	{
		Shape s= new Circle(3);
		Shape sar[] = new Shape[2];
		
		sar[0] = new Circle(2);
		
		System.out.println(s);
		
		
	}
	

}
