package com.inheritanceassignments;

public class Question1Employee {
	
	int empid;
	
	double salary;
	
	public Question1Employee()
	{
		empid=0;
		salary=0;
	}
	
	public Question1Employee(int empid, double salary)
	{
		System.out.println("Inside Employee's Parameterized Constructor");
		this.empid=empid;
		
		this.salary=salary;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	
	public double getEmpSalary()
	{
		return salary;
	}
	
	public void setEmpSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String toString()
	{
		return "Employee id:" +empid+ " Employee salary:"+ salary;
	}
	

}
