package com.hashsetassignmentns;

import java.util.LinkedHashSet;

public class StudentLinkedHashSet {
	
	public static void main(String args[])
	{
		LinkedHashSet<Student> linkedhashset= new LinkedHashSet<>();
		linkedhashset.add(new Student(1001,"Aadarsh"));
		linkedhashset.add(new Student(1003,"Rohit"));
		linkedhashset.add(new Student(1002,"Jayraj"));
		linkedhashset.add(new Student(1005,"Abhishek"));
		linkedhashset.add(new Student(1005,"Abhishek"));
		
		
		for(Student i:linkedhashset)
			System.out.println(i);
		
		System.out.println("__________ Duplicate Objects are added, we need to avoid this_____");
		System.out.println("___________So, we override HashCode() and equals()__________");
		
		
		
	}

}
