package com.hashsetdemos;

import com.maphashmap.Department;

public class Employee {
	
	int empid;
	String empname;
	double empsal;
	
	public Employee(int empid, String empname, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	

	@Override
	public int hashCode()
	{
		return empid;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee e=(Employee) obj; //Type casting is needed
		if(this.empid==e.empid && this.empname==e.empname && this.empsal==e.empsal)
			return true;
		else
			return false;
	}
	

}
