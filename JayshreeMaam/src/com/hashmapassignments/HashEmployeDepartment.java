package com.hashmapassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashEmployeDepartment {
	
	public static void main(String args[])
	{
		HashMap<Employee,Department> employee_map= new HashMap<Employee,Department>();
		
		employee_map.put(new Employee(25,"John"), new Department(1001,"IT","Pune"));
		employee_map.put(new Employee(25,"Aadarsh"), new Department(1002,"QA","Pune"));
		employee_map.put(new Employee(25,"Sudharshan"), new Department(1003,"HR","Pune"));
		employee_map.put(new Employee(25,"Prashant"), new Department(1004,"QA","Pune"));
		
		Set<Entry<Employee,Department>> std=employee_map.entrySet();
		Iterator<Entry<Employee,Department>> itr= std.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
