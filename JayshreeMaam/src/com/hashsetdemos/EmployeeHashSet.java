package com.hashsetdemos;

import java.util.HashSet;

public class EmployeeHashSet {
	
	public static void main(String args[])
	{
		HashSet<Employee> hashset= new HashSet<>();
		
		hashset.add(new Employee(101,"Aadarsh",27000));
		hashset.add(new Employee(102,"Sudharshan",35000));
		hashset.add(new Employee(103,"Suraj",45000));
		
		System.out.println("Display before adding a new object:");
		for(Employee obj:hashset)
			System.out.println(obj);
		
	//	System.out.println("Checking if hashset coontains Suraj:"+hashset.contains(new Employee(103,"Suraj",45000)));
		
		hashset.add(new Employee(103,"Suraj",45000));

		System.out.println("____________________________________________________________");
		
		System.out.println("Display after adding a new object:");
		for(Employee obj:hashset)
			System.out.println(obj);
		
		
		
	}

}
