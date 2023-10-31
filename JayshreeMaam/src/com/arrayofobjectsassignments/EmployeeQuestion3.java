package com.arrayofobjectsassignments;
/*
 3.	Create class Dept(did, dname), class MyDate(day, month, year)
	a.Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
	Create array of Employee and display the array elements.

  */

public class EmployeeQuestion3 {
	
	String emp_name;
	int salary;
	DepartmentQuestion3 dep;
	MyDateQuestion3 doj;
	
	public EmployeeQuestion3()
	{
		emp_name="";
		salary=0;
		dep= new DepartmentQuestion3();
		doj= new MyDateQuestion3();
	}
	
	public EmployeeQuestion3(String emp_name, int salary, DepartmentQuestion3 dep, MyDateQuestion3 doj)
	{
		this.emp_name=emp_name;
		this.salary=salary;
		this.dep=dep;
		this.doj=doj;
	}
	
	public String toString()
	{
		return " Employee name:"+ emp_name + " Salary:" +salary+ " Department:"+ dep+ " Date:"+doj;
	}
	
	public static void main(String args[])
	{
		EmployeeQuestion3[] emp= new EmployeeQuestion3[4];
		emp[0]= new EmployeeQuestion3(  "Rohit",20000, new DepartmentQuestion3(101, "Bio"),new MyDateQuestion3(11,12,2023));
		emp[1]= new EmployeeQuestion3(  "Jay",20000, new DepartmentQuestion3(102, "Chem"),new MyDateQuestion3(12,12,2023));
		emp[2]= new EmployeeQuestion3(  "Abhishek",20000, new DepartmentQuestion3(104, "Phys"),new MyDateQuestion3(11,12,2023));
		emp[3]= new EmployeeQuestion3(  "Abhijeet",20000, new DepartmentQuestion3(104, "Phys"),new MyDateQuestion3(11,12,2023));
		
	//	for(int i=0;i<emp.length;i++)
	//		System.out.println(emp[i]);
		
		for(int i=0;i<emp.length;i++)
		{
			for(int j=0;j<emp.length;j++)
			{
				//compare department
				if(emp[i].dep.compareDepartment(emp[j].dep) && i!=j) 
				{
					System.out.println(emp[i]);
					break;
				}
			}
		}
		
	}
}
