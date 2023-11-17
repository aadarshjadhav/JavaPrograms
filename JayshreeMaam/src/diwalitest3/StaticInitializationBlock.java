package diwalitest3;

public class StaticInitializationBlock{
	
	static
	{
		System.out.println(2);
	}
	public static void main(String[] args)
	{	System.out.println(3);
		System.out.println(ClassAStatic.i);
	}


}
