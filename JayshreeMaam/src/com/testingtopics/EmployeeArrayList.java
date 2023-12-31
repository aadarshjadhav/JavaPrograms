package com.testingtopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import com.arraylistdemos.DepartmentLocationComparator;

public class EmployeeArrayList {
	
	public static void main(String args[])
	{
		ArrayList<Employee> emp_list= new ArrayList<>();
		
	//	ArrayList<String> D1= new ArrayList<>(Arrays.asList("Manager","Team"));
		emp_list.add(new Employee(1,"Aadarsh", 20000, "Developer", 25, new Department(1001,"Development", "Pune")));
		emp_list.add(new Employee(2,"Judarshan", 20000, "Developer", 23, new Department(1002,"Development", "Pune")));
		emp_list.add(new Employee(3,"Ishhwar", 20000, "Senior Developer", 25, new Department(1003,"IT", "Banglore")));
		emp_list.add(new Employee(4,"Maroti", 22000, "Web Developer", 27, new Department(1003,"IT", "Delhi")));
		emp_list.add(new Employee(5,"Abhishek", 20000, "Web Developer", 24, new Department(1004,"IT", "Chennai")));
		emp_list.add(new Employee(6,"Junish", 21000, "QA", 23, new Department(1005,"Development", "Erode")));
		emp_list.add(new Employee(7,"Pranshant", 20000, "QA", 25, new Department(1006,"Development", "Pune")));
		emp_list.add(new Employee(8,"Sunish", 10000, "QA", 25, new Department(1005,"Development", "Erode")));

		//Iterator<Employee> itr;
		Collections.sort(emp_list); //compareTo () from Employee
		
		Iterator<Employee> itr= emp_list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		DepartmentLocationComparator1 dep= new DepartmentLocationComparator1();
		
		Collections.sort(emp_list, dep);
		System.out.println("_________________________________________________________");
		
		itr= emp_list.iterator(); //Resetting the iterator back to it's original position
		System.out.println("_________________________________________________________");
		System.out.println("ArrayList after sorting based on Location");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	
	}

}
