package com.arrayofobjectsassignments;

public class DepartmentQuestion3 {
	
	int did;
	String dname;
	
	public DepartmentQuestion3()
	{
		did=0;
		dname="";
	}
	
	public DepartmentQuestion3(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	//Compapre departments
	public boolean compareDepartment(DepartmentQuestion3 obj)
	{
		if(this.did== obj.did && this.dname==obj.dname)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return " Department ID:" + did+ " Department:" + dname;
	}
	
	
	
	
}
