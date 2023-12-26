package com.threads;

public class RunnableDemo implements Runnable {
	
	

	public static void main(String[] args) 
	{
		Runnable t=new RunnableDemo();
		Thread t1= new Thread(t,"Ping");
		t1.start();
		Thread t2= new Thread(new RunnableDemo(),"Pong");
		t2.start();
		
		
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i+":"+Thread.currentThread().getName()+" ");
		}
	}

}
