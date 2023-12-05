package com.treesetassignments;

import java.util.TreeSet;

public class FirstandLastElement {
	
	public static void main(String args[])
	{
		TreeSet<String> treeset= new TreeSet<>();
		treeset.add("Red");
		treeset.add("Blue");
		treeset.add("Yellow");
		treeset.add("White");
		
		System.out.println("_____________First and Last Element_____________");
		System.out.println("First element:"+treeset.first());
		System.out.println("Last element:"+treeset.last());
		
		System.out.println();
		
		System.out.println("________________GreaterOrEqualsElement____________");
		System.out.println("Greater than or equals element 'Black'"+treeset.ceiling("Black"));
		
		System.out.println("__________Less than or equal to_________");
		System.out.println("Less than or equal to element 'Purple':"+treeset.floor("Purple"));

		
		
	}

}
