package com.arraylistdemos;

import java.util.ArrayList;
import java.util.Comparator;

public class MaxSalaryEmployee {

	public void findMaxSalary(ArrayList<Employee> Employees, String department)
	{
		double max=0;
		Employee e1=null;
		
		for(int i=0;i<Employees.size();i++)
		{
			if(Employees.get(i).dep.depname.equals(department))
			{
				if(Employees.get(i).getEmpsal()>max)
				{
					max=Employees.get(i).empsal;
					e1= Employees.get(i);
				}
			}
		}
		System.out.println("Employee with max salary:"+e1);
	}
	

}
