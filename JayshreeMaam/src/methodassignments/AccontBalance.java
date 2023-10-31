package methodassignments;

import java.util.Scanner;

public class AccontBalance {
	
	private int acc_no;
	private String name;
	private float amount;
	
	public void insert()
	{
		System.out.println("Enter the account number:");
		Scanner sc= new Scanner(System.in);
		acc_no=sc.nextInt();
		
		System.out.println("Enter the name:");
		name=sc.next();
		
		System.out.println("Enter amount in the account:");
		amount=sc.nextFloat();
		
	}
	public void display()
	{
		System.out.println("Account Number:"+ acc_no);
		System.out.println("Account Name:"+ name);
		System.out.println("Account Balance:"+ amount);
	}
	public void deposit()
	{
		System.out.println("Enter the amount to be deposited:");
		Scanner sc= new Scanner(System.in);
		float deposit_amount= sc.nextFloat();
		amount+=deposit_amount;
	}
	public void withdraw()
	{
		System.out.println("Enter the amount to be widthdrawn:");
		Scanner sc= new Scanner(System.in);
		float widthdrawn_amount= sc.nextFloat();
		
		if(widthdrawn_amount<amount)
		{
			amount-=widthdrawn_amount;
			System.out.println("Amount widthdrawn successful!!");
		}
		else
		{
			System.out.println("Insufficient Balance!!");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("Account Balance:"+amount);
	}
	
	public static void main(String args[])
	{
		AccontBalance acb= new AccontBalance();
		
		System.out.println("Menu");
		System.out.println("1.Insert");
		System.out.println("2.Display");
		System.out.println("3.Deposit");
		System.out.println("4.Widthdraw");
		System.out.println("5.Balance");
		
		boolean status=true;
		do {
			System.out.println("Enter the option:");
			Scanner sc= new Scanner(System.in);
			int option=sc.nextInt();
			
			switch(option)
			{
				
				case 1:acb.insert();
						break;
				case 2:acb.display();
						break;
				case 3:acb.deposit();
						break;
				case 4:acb.withdraw();
						break;
				case 5:acb.checkbalance();
						break;
						
				default: System.out.println("Wrong option entered!!!");
				
				option=0;
				
			}
		
			System.out.println("Do you want to go again?");
			String again=sc.next();
			if(again=="yes")
				status=true;
			else
				status=false;
			
		}while(status==false);
	}
}
