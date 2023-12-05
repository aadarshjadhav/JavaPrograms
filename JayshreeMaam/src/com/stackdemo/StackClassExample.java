package com.stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackClassExample {
	
	public static void main(String args[])
	{
		Stack<Integer> stack= new Stack<>();
		stack.push(10);
		stack.push(8);
		stack.push(5);
		stack.push(7);
		stack.push(4);
		
		System.out.println("Stack:"+stack);
		
		System.out.println("Peek:"+stack.peek());
		
		System.out.println("______Iterating usinng Iterator_______:");
		Iterator<Integer> itr= stack.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Position:"+stack.search(5)); //Search() is not a zero based index!!!!
		
		System.out.println("Removing:");
		while(!stack.empty())
		{
			System.out.println(stack.pop());
		}
	}

}
