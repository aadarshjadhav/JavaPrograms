package com.synchronization;

public class Account {
	
	private long balance=5000;
	
	public long getBalance()
	{
		return balance;
		
	}
	
	public void widthDraw(int amount)
	{
		if(balance > amount)
		{
			balance=balance-amount;
			System.out.println("The amount is widthdraw by"+ Thread.currentThread().getName());
			
			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+":Insufficient amount");
		}
	}

}
