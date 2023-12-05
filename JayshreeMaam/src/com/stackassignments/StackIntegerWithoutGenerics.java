package com.stackassignments;

import java.util.Iterator;
import java.util.Stack;

import com.stackdemo.Student;

// WAP to create a Stack with Integer objects without using generics
public class StackIntegerWithoutGenerics {
	
	public static void main(String args[])
	{
		Stack stack=new Stack();
		stack.push(12);
		stack.push(14);
		stack.push(15);
		
		Iterator itr= stack.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
