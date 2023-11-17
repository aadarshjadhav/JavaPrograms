package diwalitest2;

public class Shopping {

	public Shopping()
	{
		
	}
	public void doTransaction(CreditCard cc)
	{
		System.out.println("15% discount");
	}
	
	public void doTransaction(DebitCard dc)
	{
		System.out.println("No disicouunts");
	}
	
	public static void main(String args[])
	{
		Shopping s= new Shopping();
		
		CreditCard cc= new CreditCard();
		DebitCard dc= new DebitCard();
		s.doTransaction(dc);
		s.doTransaction(cc);
		
	}

	
}
