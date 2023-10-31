package com.inheritencedemo;

public class Test1 {
	
	public static void display(Employee obj)
	{
		System.out.println(obj);
	}
	
	public static void calculateSal(Employee e[])
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].calculateSalary());
			
			//or
			/*
			 * 	for(Employee obj:e)
			 * 		obj.calculateSal();
			 * */

		}
	}
	
	public static void main(String args[])
	{
		Employee m= new Manager(101, "Pankaj", 25000, new MyDate(),5,2000);
		
		// in polymorphic reference  we can all the methods of super class and
		//overidden methhod of sub class
		
		m.calculateSalary();
		((Manager)m).setBonus(2500);
		
		display(m);
		Employee obj[]= new Employee[3];
		obj[0]=new Employee(101, "aaa", 25000, new MyDate());
		obj[1]=new Manager(102, "bbb", 35000, new MyDate(), 3, 5000);
		obj[2]=new WageEmp(103, "ccc", 45000, new MyDate(), 20,50);
		
		calculateSal(obj);
	}

}
