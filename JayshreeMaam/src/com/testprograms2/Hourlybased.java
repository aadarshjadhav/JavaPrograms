package com.testprograms2;

public class Hourlybased extends Teacher {
	
	int rate_per_hr;
	int hrs;
	
	public Hourlybased()
	{
		
	}
	
	public Hourlybased(int rate_per_hr, int hrs)
	{
		this.hrs=hrs;
		this.rate_per_hr= rate_per_hr;
	}
	
	void salary()
	{
		System.out.println(" Hourly based salary");
	}
}
