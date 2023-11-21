package com.exceptiondemo;

import java.util.Scanner;

public class Atm {
	
	int accno;
	String accname;
	double balance;
	
	
	public Atm()
	{
		accno=0;
		accname="null";
		balance=0;
	}
	
	public Atm(int accno, String accname, double balance)
	{
		this.accno=accno;
		this.accname=accname;
		this.balance=balance;
	}
	
	public void widthdraw() throws InsufficientBalanceException 
	{
		Scanner sc= new Scanner(System.in);
//		try
//		{
			System.out.println("Enter the amount to widthdraw:");
			double widthdraw_amount= sc.nextDouble();
			if(this.balance<widthdraw_amount) //Two ways to handle exception, either try catch or throws way. But in checked exceptions, most of the time throws is used to handle that exception
				throw new InsufficientBalanceException(balance);
			this.balance-=this.balance-widthdraw_amount;
			
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
	}
	
	
	public static void main(String args[]) 
	{
		Atm a= new Atm(10001,"John",20000);
	//	System.out.println("Enter the bank details:");
		Scanner sc= new Scanner(System.in);
		
		a.widthdraw();
		
	}

}
