package staticprograms;

public class AccountInitBlockInterestRate {
	
	static float interestRate;
	
	static
	{
		interestRate = 8/100.0f;
	}
	
	public static float getInterestRate()
	{
		return interestRate;
	}

}
