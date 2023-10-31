package com.overriding;

public class SavingsAccount extends DefaultAccount{
	
	double roi;
	
	public SavingsAccount()
	{
		roi=0.03;
	}
	
	public double rateOfInterest()
	{
		System.out.println("Inside Savings Account method");
		return roi;
	}

}
