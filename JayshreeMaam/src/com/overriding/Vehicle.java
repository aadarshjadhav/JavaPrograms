package com.overriding;

public class Vehicle {
	
	long mph;
	String start;
	String brake;
	
	
	public Vehicle()
	{
		mph=0;
	}
	
	public void accelerate(long mph)
	{
		System.out.println("Inside parent class");
		this.mph=mph;
	}
	
	public String stop()
	{
		return brake;
	}
	
	public String run()
	{
		return start;
	}
	
	
	

}
