package com.inheritencedemo;

public class WageEmp extends Employee {
	
	double hrs, rate;
	public WageEmp()
	{
		
	}
	
	public WageEmp( int eid, String name, double sal, MyDate doj, double h, double rate)
	{
		super(eid,name,sal,doj);
		this.hrs=h;
		this.rate=rate;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "HRs "+ hrs +" Rate"+rate;
	}
	
	public double calculateSalary()
	{
		System.out.println(" inn WageEmp calculateSalary");
		double s= super.calculateSalary()+ hrs*rate;
		super.setSalary(s);
		return s;
		
	}
	
	public static void main(String args[])
	{
		WageEmp we= new WageEmp(101, "Kanchan", 20000, new MyDate(24,10,2023), 50,25);
		System.out.println(we.calculateSalary());
		System.out.println(we);
	}

}
