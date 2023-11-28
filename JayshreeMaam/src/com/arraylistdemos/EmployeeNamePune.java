package com.arraylistdemos;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeNamePune{

	
	public void findByLocation(ArrayList<Employee> EmployeeArrayList, String location) 
	{
		ArrayList<Employee> location_list= new ArrayList<Employee>();
		for(Employee emp: EmployeeArrayList)
			if(emp.dep.getLocation().equals(location))
				location_list.add(emp);
		
		Iterator<Employee> itr= location_list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
