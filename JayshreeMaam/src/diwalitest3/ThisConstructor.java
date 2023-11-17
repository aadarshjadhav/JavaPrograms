package diwalitest3;

public class ThisConstructor {
	
	
	ThisConstructor()
	{
		this(5);
		System.out.println("The Default constructor");
	}
	
	ThisConstructor(int x)
	{
		this(5, 15);
		System.out.println(x);
	}
	
	ThisConstructor(int x, int y)
	{
		System.out.println(x * y);
	}
	public static void main(String args[])
	{
		new ThisConstructor();
	}
}


