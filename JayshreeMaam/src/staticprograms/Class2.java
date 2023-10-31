package staticprograms;

public class Class2 {
	
	private static int b;
	static
	{
		b=2;
		System.out.println("Class2:"+b);
	}

	public static int getClass2()
	{
		return b;
	}

}
