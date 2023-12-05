package com.stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class StudentStack {
	
	public static void main(String args[])
	{
		Stack<Student> stack= new Stack<>();
		stack.push(new Student(1,"Aadarsh"));
		stack.push(new Student(3,"Jayraj"));
		stack.push(new Student(2,"Rohit"));
		
		Iterator<Student> itr= stack.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
