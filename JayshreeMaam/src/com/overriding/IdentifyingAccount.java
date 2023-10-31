package com.overriding;

public class IdentifyingAccount extends DefaultAccount{

	public IdentifyingAccount()
	{
		
	}
	
	public static void main(String args[])
	{
		DefaultAccount def[]= new DefaultAccount[3];
		def[0]= new DefaultAccount();
		def[1]= new SavingsAccount();
		def[2]= new CurrentAccount();
		
		
		for(int i=0;i<def.length;i++)
		{
			if(def[i] instanceof SavingsAccount)
			{
				System.out.println("SavingsAccount");
				System.out.println(def[i].rateOfInterest());
			}
			else if(def[i] instanceof CurrentAccount)
			{
				System.out.println("CurrentAccount");
				System.out.println(def[i].rateOfInterest());
			}
			else
			{
				System.out.println("Default Account");
				System.out.println(def[i].rateOfInterest());
			}
		}
		
		
	}
}
