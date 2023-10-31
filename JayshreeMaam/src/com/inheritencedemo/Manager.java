package com.inheritencedemo;

public class Manager extends Employee {
	
	int noofemp;
	double bonus;
	
	public Manager()
	{
		System.out.println("Default con of Manager");
		bonus=0;
		noofemp=0;
	}
	public Manager(int eid, String name, double sal, MyDate d, int noofemp, double b)
	{
		//Default constructor of super class is get called by default
		// super must be thhe first statement in a constructor
		
		super(eid, name,sal,d);
		System.out.println("Parameterized constructor of Manager");
		this.noofemp=noofemp;
		this.bonus=b;
		
	}
	
	public String toString()
	{
		return super.toString()+"No of Employee"+ noofemp+" Bonus"+ bonus;
	}
	
	public void setBonus(int amt)
	{
		bonus=amt;
	}
	
	@Override
	public double calculateSalary()
	{
		System.out.println(" Inside Manager calculateSalary");
		double s= super.calculateSalary()+bonus;
		super.setSalary(s);
		return(s);
	}
	
	public static void main(String args[])
	{
		Manager m=new Manager();
		System.out.println(m);
		
		Manager m1= new Manager(101, "Kanchan", 25000, new MyDate(25,10,2023), 2, 2500);
		System.out.println(m1);
		System.out.println("Salary is "+ m1.calculateSalary());
	}

}
