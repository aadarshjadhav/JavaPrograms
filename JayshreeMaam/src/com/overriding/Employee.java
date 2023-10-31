package com.overriding;

public class Employee extends Programmer {
	
	public Employee()
	{
		
	}
	
	public void workinghours()
	{
		System.out.println("Inside class Employee workinghours methhod");
	}
	
	public static void main(String args[])
	{
		Programmer emp= new Employee();
		emp.workinghours();
		
	}

}
