package com.interfacedemos;

public class A6 implements Printable {
	
	public void print()
	{
		System.out.println("In A6 class priint methhod");
		
	}
	
	public static void main(String args[])
	{
		A6 obj =new A6();
		Printable p= new A6();
		obj.print();
		p.print();
		
	}

}
