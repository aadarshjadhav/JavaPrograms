package com.finals;

public /*final*/ class Employee {
	
	int eid; 
	double salary;
	
	public Employee()
	{
		eid=0;
		salary=0;
	}
	
	public Employee(int eid, double salary)
	{
		this.eid=eid;
		this.salary=salary;
	}
	
	public final double getSalary()
	{
		return salary;
	}
	
	

}
