package com.testingtopics;

public class Employee implements Comparable<Employee> {
	
	int empid;
	String empname;
	Integer empsal;
	String empdesignation;
	Integer age;
	
	
	Department dep;

	public Employee()
	{
		dep=new Department();
	}

	public Employee(int empid, String empname, int empsal, String empdesignation, int age, Department dep) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empdesignation = empdesignation;
		this.age = age;
		this.dep=dep;
	}

	public int getEmpid() 
	{
		return empid;
	}

	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}

	public String getEmpname() 
	{
		return empname;
	}

	public void setEmpname(String empname) 
	{
		this.empname = empname;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) 
	{
		this.empsal = empsal;
	}

	public String getEmpdesignation() 
	{
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) 
	{
		this.empdesignation = empdesignation;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	
	public String toString() 
	{
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empdesignation="
				+ empdesignation + ", age=" + age + "]"+ dep;
	}
	
	//Getters and setters for Department array
	public Department getDepartment() 
	{
		return dep;
	}

	public void setDepartment(Department dep) 
	{
		this.dep = dep;
	}
	
	public int compareTo(Employee o)  //Here Object o is changed to Student o
	{
	/*	if(this.empid==o.empid)		//This compareTo() applies if-else logic based
			return 0;
		else if(this.empid<o.empid)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}*/
		System.out.println("Inside Employee class compareTo method");
		int id=o.empid;			//this is how compareTo is done without logic
		Integer i=id;
		Integer ii =this.empid;
		
	//	return ii.compareTo(i); //Done with ascending order
		return i.compareTo(ii); //Done with descending order
		
	}
}
