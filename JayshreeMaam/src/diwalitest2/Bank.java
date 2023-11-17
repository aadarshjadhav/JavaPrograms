package diwalitest2;

public class Bank {
	
	public Bank()
	{
		
	}
	
	public String deposit()
	{
		return "Anonymous object works!";
	}
	
	public static void main(String args[])
	{
		Bank obj= new Bank();
		Bank obj2=obj;
		
		System.out.println("Hashcode obj:"+ obj.hashCode());
		System.out.println("Hashcode obj2:"+ obj2.hashCode());
		
		//Anonymous Object
		System.out.println(new Bank().deposit());
	}

}
