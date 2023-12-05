package com.treesetassignments;

import java.util.TreeSet;

public class EmployeeTreeSet {
	
	public static void main(String args[])
	{
		Employee e1= new Employee(5,"Aadarsh");
		Employee e2= new Employee(2,"Rohit");
		Employee e3= new Employee(6,"Jayraj");
		Employee e4= new Employee(1,"Abhishek");
		Employee e5= new Employee(7,"Suraj");
		Employee e6= new Employee(7,"Suraj"); //Addinng duplicate objects
		
//		TreeSet<Employee> treeset= new TreeSet<>(); 
		
		//Using this statement without implementing comparable and that to in TreeSet, 
		//compiler will show ClassCastException
		//So, it is mandatory in TreeSet to implement compaprable before adding the element in the treeset.

		
		TreeSet<Employee> treeset= new TreeSet<>(new EmployeeIdComparator());
		
		treeset.add(e1);
		treeset.add(e2);
		treeset.add(e3);
		treeset.add(e4);
		treeset.add(e5);
		treeset.add(e6);
		
		for(Employee obj:treeset)
			System.out.println(obj);
		
		System.out.println("_________________________");
		Employee e7= new Employee(1,"Aadarsh"); 
		treeset.add(e7);		//Adding duplicate elements here
		
		for(Employee obj1:treeset)
			System.out.println(obj1);
	}

}
