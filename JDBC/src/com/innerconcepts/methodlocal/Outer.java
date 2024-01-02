package com.innerconcepts.methodlocal;

public class Outer{

	int outer_n=20;
	
	public Outer()
	{
		System.out.println("Inside Outer class constructor");
	}
	
	public void show()
	{
		class Inner
		{
			int inner_n=10;
			
			public Inner()
			{
				System.out.println("Inside Inner class constructor");
			}
			public void show()
			{
				System.out.println(outer_n);
				System.out.println(inner_n);
			}
		}
		
		Inner in = new Inner();
		in.show();
		
	}
	
	public static void main(String args[])
	{
		Outer o =new Outer();
		o.show();
	}

}
