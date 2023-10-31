package com.finals;

//Final class cannot be extended
public class Manager extends Employee {
	
	Employee emp;
	final double bonus;
	double salary;
	
	public Manager()
	{	//Final variable cannot be assigned again in contrctor
		bonus=0;
		emp= new Employee();
	}
	
	public Manager(double bonus, Employee emp)
	{	
		//If Final variable is initialized in one constructor, 
		//that variable should be initialized in all construtors in that class
		this.bonus=10;
		this.emp=emp;
	}
	
	//Final method cannot be overriden in subclass
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String args[])
	{
		Employee emp= new Employee(101, 20000);
		Manager mg= new Manager(5000, emp);
		mg.getSalary();

	}
}
