package com.abstractassignments;

//	e. Can a class extend 2 or more abstract classes?
//	Ans: No, a class cannot extend 2 or more abstract classes.

public class Juicer extends Machine { //, Abs1
	
	public Juicer()
	{
		
	}
	
	public void crush()
	{
		
	}
	
	public void filter()
	{
		
	}
	
	public static void main(String args[])
	{
		Juicer j= new Juicer();
		j.crush();
		j.filter();
		j.rotate();
		
		Machine m= new Juicer();
		//m.filter();
		Machine m = new Juicer();
		m.crush();
		m.rotate();
				
		//a. Can we create an object of an abstract class?
	 	//Ans: No, We can't create an object of abstract class
		Mixer mix= new Mixer();
		
		
	}

}
