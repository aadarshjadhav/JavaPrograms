package com.hashmapassignments;

import java.util.ArrayList;

public class EmployeeWithSkills {
	
	int empid;
	String empname;
	double salary;
	ArrayList<String> skills;
	
	public EmployeeWithSkills(int empid, String empname, double salary, ArrayList<String> skills) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.skills = skills;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "EmployeeWithSkills [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", skills="
				+ skills + "]";
	}
	


}
