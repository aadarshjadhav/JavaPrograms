package com.testprograms2;

public class Job {
	int id;
	String role;
	int salary;
	
	public Job()
	{
		
	}
	
	public Job(int id, String role, int salary)
	{
		this.id=id;
		this.role=role;
		this.salary=salary;
	}
	
	public String toString()
	{
		return " id:"+id+ " role:"+ role+ " salary:" +salary;
	}

}
