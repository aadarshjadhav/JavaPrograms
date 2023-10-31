package com.experiment2;

import com.experiments.A;

public class B extends A{
	
	public B()
	{
		super.k=10;
		super.getK();
	}
	
	
	public static void main(String args[])
	{
		A a= new A();
		B b= new B();
		b.k=0;
		System.out.println();
		
	}

}
