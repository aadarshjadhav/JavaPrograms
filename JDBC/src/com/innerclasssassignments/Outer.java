package com.innerclasssassignments;
/*
 * 1.Create class Outer in which you will have private , public , static and static final variables. Create
static and non static inner class in ‘Outer’ class. Try to access all variables in both inner classes and
check which are not accessible.
 * */

//Ans: You cannot access non static variables in static class

public class Outer {
	
	private int variable1=10;
	public int variable2=20;
	static int variable3=30;
	static final int variable4=40;

	static class inner_static
	{
		public inner_static()
		{
		//	System.out.println("private variable1:"+variable1);
		//	System.out.println("public variable2:"+variable2);
			System.out.println("static variable3:"+variable3);
			System.out.println("Static final variable4:"+variable4);
		}
		
	}
	
	class inner_non_static
	{
		public inner_non_static()
		{
			System.out.println("private variable1:"+variable1);
			System.out.println("public variable2:"+variable2);
			System.out.println("static variable3:"+variable3);
			System.out.println("Static final variable4:"+variable4);
		}	
	}
}
