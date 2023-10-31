package containtmentdemo;

public class Bank {

	String bank_name, address,ifsc;
	
	Account account;
	public Bank()
	{
		String bank_name =" "; 
		String address=" ";
		String ifsc=" ";
		account= new Account();
		
	}
	public Bank(String bank_name, String address, String ifsc, Account account)
	{
		this.bank_name=bank_name;
		this.address=address;
		this.ifsc=ifsc;
		this.account=account;
	}
	//Getters
	public String getBankname()
	{
		return bank_name;
	}
	
	public String getBankaddress()
	{
		return address;
	}
	
	public String getBankifsc()
	{
		return ifsc;
	}
	
	public Account getAccount()
	{
		return account;
	}
	
	//Setters
	public void setBankname(String bank_name)
	{
		this.bank_name =bank_name;
	}
	
	public void setBankaddress(String address)
	{
		this.address =address;
	}
	
	public void setBankifsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	
	
	public void setAccount(Account account)
	{
		this.account=account;
	}
	
	public String toString()
	{
		return "Bank name:" +bank_name+"Address:"+ address+ "IFSC:"+ ifsc + " Account:" + account;
		// Here mind the account object is also passed in toString, so the compiler will go account class and check toString in Account class and print its attributes here.
	}
	
	public static void main(String args[])
	{
		Bank b= new Bank();
		System.out.println(b);
		
		Bank b1= new Bank("Axis", "SB Road","Pune", new Account (101, "Anand", 50000));
		System.out.println(b1);
	}
}
