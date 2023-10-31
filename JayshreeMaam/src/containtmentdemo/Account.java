package containtmentdemo;

public class Account {
	
	private int acc_no;
	private String acc_name;
	private float balance;
	
	public Account()
	{
		acc_no=0;
		acc_name=" ";
		balance=0.0f;
	}
	
	public Account(int acc_no, String acc_name, float balance)
	{
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.balance=balance;
	}
	
	//Getters
	public int getAccountNumber()
	{
		return acc_no;
	}
	
	public String getAccountName()
	{
		return acc_name;
	}
	
	public float getAccountBalance()
	{
		return balance;
	}
	
	//Setters
	public void setAccountNumber(int acc_no)
	{
		this.acc_no=acc_no;
	}
	
	public void setAccountName(String acc_name)
	{
		this.acc_name=acc_name;
	}
	
	public void setAccountNumber(float balance)
	{
		this.balance=balance;
	}
	
	public String toString()
	{
		return " Account Num:" + acc_no+ " Account Name:" + acc_name+ " Balance:"+balance;
	}
}
