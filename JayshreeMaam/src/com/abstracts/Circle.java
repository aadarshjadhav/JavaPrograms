package com.abstracts;

public class Circle extends Shape{

	double r;
	final double pi=3.14;
	
	public Circle(double r)
	{
		this.r=r;
	}
	
	@Override
	public double calculateArea() {
		
		return pi*r*r;
	}
	
	public  void show() {
	
		System.out.println("I am in show of Circle");
	}
	
	public static void main(String[] args) {
		
		Shape obj=new Circle(3.5);
		System.out.println(obj.calculateArea());	
		
	}	

}
	


