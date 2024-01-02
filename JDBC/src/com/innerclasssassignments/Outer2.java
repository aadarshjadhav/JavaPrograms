package com.innerclasssassignments;

/*
 * 2. Create objects on static and non static inner classes in main method. 
 * Access methods ,variable of these classes in main method.
 * */

public class Outer2 {
	
	public static class Inner_static
	{
		int inner_static_variable =10;
		public Inner_static()
		{
			
		}
		public void display() 
		{
			
			System.out.println("Inside Inner class static_display"+inner_static_variable);
			
		}
	}
	
	public class Inner_non_static
	{
		int inner_non_static_variable =20;
		public Inner_non_static()
		{
			
		}
	
		public void display() 
		{
			System.out.println("Inside Inner class Non static_display"+inner_non_static_variable);
		}
	}

	public static void main(String[] args) 
	{
		Outer2.Inner_non_static in_obj =  new Outer2().new Inner_non_static();
		
		Outer2.Inner_static in_static_obj =  new Outer2.Inner_static(); //Mind: how the static inner class variable is accessed
		// You don't need outer class object, only inner class obj and outer class reference.
		//So, only one new, instead of two new
		
		
		System.out.println(in_obj.inner_non_static_variable);
		
		System.out.println(in_static_obj.inner_static_variable);

	}

}
