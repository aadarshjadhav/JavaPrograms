package staticprograms;

public class Class1 {
	
	private static int a;
	static
	{
		a=1;
		System.out.println("Class1:"+a);
	}
	
	public static int getClass1()
	{
		return a;
	}

}
