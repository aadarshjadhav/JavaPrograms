package staticprograms;

public class CustomerCount {
	
	
	static int count;
	
	public CustomerCount()
	{
		count++;
	}
	
	public static int customernum()
	{
		return count;
	}
	public static void main(String args[])
	{
		CustomerCount.customernum();
		System.out.println("Number of customers Before! object creation:"+CustomerCount.count);
		
		CustomerCount c1= new CustomerCount();
		CustomerCount c2= new CustomerCount();
		CustomerCount c3= new CustomerCount();
		System.out.println("Number of customers After! object creation:"+CustomerCount.count);
		
	}

}
