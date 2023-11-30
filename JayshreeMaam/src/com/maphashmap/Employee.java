package com.maphashmap;

public class Employee {
	
	int empid;
	String ename;
	int salary;
	int deptid;
	
	public Employee()
	{
		
	}
	
	public Employee(int empid, String ename, int salary, int deptid) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.deptid = deptid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", deptid=" + deptid + "]";
	}
	
	

}
