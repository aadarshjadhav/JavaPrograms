package staticprograms;

public class StaticVariable {
	
	static float interestRate = 12/100.0f;
	static float compoundrate=5/100.0f;
	
	private float amount;
	private String account_name;
	
	static
	{	
		System.out.println("Inside static block");
		interestRate = 12/100.0f;
		compoundrate=5/100.0f;
	}
	
	public StaticVariable()
	{
		amount=20000;
		account_name="Aadarsh";
	}
	
	public static void ChangeIR()
	{
		interestRate=15/100.0f;
	}
	public void printAccount()
	{
		System.out.println("Account name:" +account_name);
		System.out.println("Account amount:" +amount);
		System.out.println("Interest Rate on the amount:" +(interestRate*amount));
		System.out.println("Compound Rate on the amount:" +(compoundrate*amount));

	}
	public static void main(String args[])
	{
		StaticVariable sv= new StaticVariable();
		sv.printAccount();
		
		StaticVariable sv2= new StaticVariable();
		sv2.printAccount();
		
		StaticVariable sv3= new StaticVariable();
		StaticVariable.ChangeIR();
		
		sv.printAccount();
		sv2.printAccount();
		sv3.printAccount();
		
	}
}
