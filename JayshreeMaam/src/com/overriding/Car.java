package com.overriding;

public class Car extends Vehicle{
	
	long mph;
	
	
	public Car()
	{
		
	}
	
	public void accelerate(long mph)
	{
		System.out.println("Inside child class");
		this.mph=mph*10;
	}
	
	public static void main(String args[])
	{
		Vehicle c= new Car();
		c.accelerate(23);
	}
}
