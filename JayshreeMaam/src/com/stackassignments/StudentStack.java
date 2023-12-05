package com.stackassignments;
//WAP to create a Stack with user defined class objects using generics
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
		
		//4.Use  different method calls to add elements to a Stack.
		
		System.out.println("__________Adding an Element to the Stack___________");
		
		//Three ways
		//1st Way
		stack.add(new Student(6,"Abhishek"));
		stack.add(new Student(5,"Don"));
		Iterator<Student> itr2= stack.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		//2nd Way
		stack.push(new Student(4,"Sunish"));
		
		//3rd Way
		stack.addElement(new Student(7,"Jitendra"));
		
		
		
		
		//5.WAP to check if a Stack has values
		System.out.println("__________check if a Stack has values___________"+stack.isEmpty());
		System.out.println();
		System.out.println("__________Search element position in the Stack___________"+stack.search(new Student(2,"Rohit")));
		//Search method calls equals method, but we overide it in Student class to search the object
		
		Iterator<Student> itr3= stack.iterator();
		while(itr3.hasNext())
			System.out.println(itr3.next());
		
		System.out.println("__________Popping an Element_______________"+stack.pop());
		System.out.println();
		////No use implementing comparable interface because Stack Class never calls compareTo mthod
		
		System.out.println("________Display after popping an Elememnt_______");
		Iterator<Student> itr4= stack.iterator();
		while(itr4.hasNext())
			System.out.println(itr4.next());
	}

}
