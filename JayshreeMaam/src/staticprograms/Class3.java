package staticprograms;

public class Class3 {
	
	private static int c;
	static
	{
		c=3;
		System.out.println("Class3:"+c);
	}
	
	public static int getClass3()
	{
		return c;
	}

	
	public static void main(String args[])
	{
		//Mind the sequence of these classes
		Class2.getClass2();
		Class1.getClass1();
		
		Class3.getClass3();
	}
}
