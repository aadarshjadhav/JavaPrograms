package com.testprograms2;

public class Volume {
	
	public Volume()
	{
		
	}
	
	public double volume(double r)
	{
		return ((4/3)*(22/7)*(r*r*r));
	}
	
	public double volume(double h, double r)
	{
		return ((22/7)*(r*r)*(h));
	}
	
	public double volume(double l, double b, double h)
	{
		return (l*b*h);
	}
	
	public static void main(String args[])
	{
		Volume v= new Volume();
		System.out.println("Volume of sphere:"+v.volume(3));
		System.out.println("Volume of cylinder:"+v.volume(3,5));
		System.out.println("Volume of cuboid:"+v.volume(3,5,6));
	}
}
