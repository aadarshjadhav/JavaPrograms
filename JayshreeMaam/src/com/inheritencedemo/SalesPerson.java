package com.inheritencedemo;

public class SalesPerson extends WageEmp{
	
	double sales,comm;
	
	public SalesPerson()
	{
		
	}

	public SalesPerson(int eid, String name, double sal, MyDate d, double h, double rate, double s, double c)
	{
		super(eid, name, sal, d, h, rate);
		this.comm=c;
		this.sales=s;
	}
	
	public String toString()
	{
		return super.toString()+" Sales"+ sales+ " comm"+ comm;
		
	}
	public double calculateSalary()
	{
		System.out.println("Inside Salesperson's calculateSalary");
		double s=super.calculateSalary()+sales*comm;
		super.setSalary(s);
		return s;
	}
	
	public static void main(String[] args)
	{
		SalesPerson s=new SalesPerson(101, "Kanchan", 10000, new MyDate(), 50, 25, 10000, 0.1);
		System.out.println(s.calculateSalary());
		System.out.println(s);
	}
}
