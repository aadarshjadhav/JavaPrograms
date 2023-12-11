package com.testprograms6;

import java.util.HashMap;

public class EmployeeHashMap {
	
	public static void main(String args[])
	{
		HashMap<Employee,String> emp_hashmap= new HashMap<>();
		emp_hashmap.put(new Employee(1,"Aadarsh"), "IT");
		emp_hashmap.put(new Employee(2,"Rohit"), "Dev");
		
		//puting the same key object, if, we don't override the hashCode and equals method, duplicate object will be stored
		emp_hashmap.put(new Employee(2,"Rohit"), "SQL");
		
		System.out.println(emp_hashmap);
		
		
	}

}
