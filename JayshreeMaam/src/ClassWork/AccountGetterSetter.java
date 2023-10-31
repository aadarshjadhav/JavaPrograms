package ClassWork;

public class AccountGetterSetter {
	private int accNo;
	private String ownername;
	private long balance;
	
	//Defaultt Constructor
	public AccountGetterSetter() 
	{
		System.out.println("Inside default Constructor");
		accNo=1003;
		ownername="Gosling";
		balance=435463574;
	}
	
	//Parameterized Constructor
	public AccountGetterSetter(int an, String own, long balanx)
	{
		System.out.println("Inside parameterized Constructor");
		accNo=an;
		ownername= own;
		balance= balanx;
	}
	
	//Setters
	public void setAccno(int acn)
	{
		accNo=acn;
	}
	public void setOwner(String own)
	{
		ownername=own;
	}
	public void setBalance(long bal)
	{
		balance=bal;
	}
	
	//Getters
	public long getAccno()
	{
		return accNo;
	}
	
	public String getOwnerName()
	{
		return ownername;
	}
	
	public long getBalance()
	{
		return balance;
	}
	
	//Main method
	public static void main(String args[])
	{
		AccountGetterSetter ags= new AccountGetterSetter();
		
		//Using setters
		ags.setAccno(1001);
		ags.setOwner("James");
		ags.setBalance(999999999);
		
		//Using getters
		long main_accno=ags.getAccno();
		String main_ownername=ags.getOwnerName();
		long main_balance=ags.getBalance();
		
		System.out.println("The account number:"+ main_accno);
		System.out.println("The account owner name:"+ main_ownername);
		System.out.println("The account balance:"+ main_balance);
		
		//Default Constructor
		AccountGetterSetter ags1= new AccountGetterSetter();
		
		//Parameterized Constructor
		AccountGetterSetter ags2= new AccountGetterSetter(1002,"Bond",2034323423);
		
	}

}
