package com.hashmapassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//WAP to create a map using Custom class as key and any other JDK provided object as value

public class StudentHashClass {
	
	public static void main(String args[])
	{
		Student s1= new Student(11,"Aadarsh",40);
		Student s2= new Student(12,"Sudharshan",30);
		Student s3= new Student(13,"Maroti",45);
		Student s4= new Student(14,"Prashant",46);
		
		HashMap<Student,String> student_map= new HashMap<Student,String>();
		student_map.put(s1, "Java");
		student_map.put(s2, "Python");
		student_map.put(s3, "SQL");
		student_map.put(s4, "C#");
		student_map.put(s1, "SQL");

		student_map.put(new Student(25,"John",47), "C++");
		
//		System.out.println(student_map);
		
		Set<Entry<Student,String>> std=student_map.entrySet();
		Iterator<Entry<Student,String>> itr= std.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
