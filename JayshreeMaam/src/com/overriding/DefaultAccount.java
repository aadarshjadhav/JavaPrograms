package com.overriding;

public class DefaultAccount {
	
	//double principle_amount;
	double roi;
	
	public DefaultAccount()
	{
		roi=0.02;
	}
	
	public double rateOfInterest()
	{
		System.out.println("Inside Default ACCOUNT method");
		return roi;
	}

}
