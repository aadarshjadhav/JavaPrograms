package com.overriding;

public class CurrentAccount extends DefaultAccount{
	
	double roi;
	
	public CurrentAccount()
	{
		roi=0.05;
	}
	
	public double rateOfInterest()
	{
		System.out.println("Inside Current Account method");
		return roi;
	}


}
