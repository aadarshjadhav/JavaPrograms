package containtmentdemo;

public class AccountMain {
	
	public static void main(String args[])
	{
		Account accArr[]=new Account[3];
		accArr[0]=new Account(101, "Arti", 89000.0f);
		accArr[1]=new Account(102, "Pooja", 45000.0f);
		accArr[2]=new Account(103, "Leena", 67000.0f);
	
		for(int i=0; i<accArr.length;i++)
		{
			System.out.println(accArr[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(Account a:accArr)
			System.out.println(a);
		
		double max=0;
		String name="";
		
		for(Account a1:accArr)
		{
			if(a1.getAccountBalance()>max)
			{
				max=a1.getAccountBalance();
				name=a1.getAccountName();
			}
		}
		System.out.println(name+ " is having maximum balance rs:"+max);
		
	}
}