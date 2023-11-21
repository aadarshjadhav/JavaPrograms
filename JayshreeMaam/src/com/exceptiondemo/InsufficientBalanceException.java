package com.exceptiondemo;

public class InsufficientBalanceException extends Exception {
	double balance;
	
	public InsufficientBalanceException()
	{
		
	}

	public InsufficientBalanceException(double balance)
	{
		this.balance=balance;
	}
	
	public String toString()
	{
		return "Insufficient Balance:" +balance;
	}
}
