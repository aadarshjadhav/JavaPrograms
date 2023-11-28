package com.arraylistdemos;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpNameStartWithJ {
	
	public void findEmpNameStart(ArrayList<Employee> employee_array_list, String str) 
	{
		ArrayList<Employee> names_list= new ArrayList<Employee>();
		for(Employee emp: employee_array_list)
			if(emp.getEmpname().startsWith(str))
				names_list.add(emp);
		
		Iterator<Employee> itr= names_list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
