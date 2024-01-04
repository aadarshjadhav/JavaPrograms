package com.finaltestpractices;
/*
 * Q18. Consider the scenario of ATM center with one machine , 
 * 		where in only one person at a time is allowed to do any transaction like  
 * 		withdraw / see balance/ get mini statement etc.  
 * 		After that next will be able to do it.  
 * 		Write a code to map this scenario using Thread
 * */
import com.finaltestpractices.*;

import java.util.Scanner;

public class ATMMachine implements Runnable{

	private Account a1;
	private Thread t1,t2;
	
	ATMMachine()
	{
		a1= new Account();
		t1= new Thread(this,"Person 1");
		t2= new Thread(this, "Person 2");
		
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) 
	{
		ATMMachine obj_atm=new ATMMachine();
		
	}

	@Override
	public void run() {
		
		synchronized(this)
		{
			
			Scanner sc= new Scanner(System.in);
			
			char ch;
			do
			{
				System.out.println("_________Menu_______");
				System.out.println("1.Check Balance");
				System.out.println("2.Deposit Amount");
				System.out.println("3.Widthdraw Amount");
				System.out.println("Enter the option:");
				int option=sc.nextInt();
				switch(option)
				{
					case 1: System.out.println("Balance:"+a1.getBalance());
							break;
							
					case 2: System.out.println("Enter the amount to deposit:");
							int d_amount=sc.nextInt();
							a1.deposit(d_amount);
							break;
					
					case 3: System.out.println("Enter the amount to widthdraw:");
							int w_amount=sc.nextInt();
							a1.withDraw(w_amount);
							break;
					
					default: System.out.println("Wrong optin entered!!");
				}
			
				System.out.println("Do you want to go again?(y/n):");
				ch=sc.next().charAt(0);
				
			}while(ch=='y' || ch=='Y');
			
		}
		
	}

}
