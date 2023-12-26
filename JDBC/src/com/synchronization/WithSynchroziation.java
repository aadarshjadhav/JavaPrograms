package com.synchronization;

public class WithSynchroziation implements Runnable{
	
	private Account a1;
	private Thread t1,t2;
	
	WithSynchroziation()
	{
		a1= new Account();
		
		t1= new Thread (this,"Person 1");
		t2=new Thread(this,"Person 2");
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		
//		this.doTransaction(); //This is without Synchronization
		
		synchronized(this)	//This is with Synchronization
		{
			doTransaction();
		}
	}
	
	public void doTransaction()
	{
		System.out.println(Thread.currentThread().getName()+"is checking the balance = "+a1.getBalance());
		a1.widthDraw(4500);
	}
	public static void main(String[] args) 
	{
		WithSynchroziation wo= new WithSynchroziation();

	}


}
