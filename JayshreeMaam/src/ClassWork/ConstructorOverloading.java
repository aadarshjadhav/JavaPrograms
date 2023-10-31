package ClassWork;

public class ConstructorOverloading {

	public ConstructorOverloading(double a, double b)
	{
		System.out.println("inside double constructor");
		System.out.println("Addititon integer:"+ (a+b));
	}
	
	public ConstructorOverloading(float a, float b)
	{
		System.out.println("inside float constructor");
		System.out.println("Addititon integer:"+ (a+b));
		
	}
	
	public static void main(String args[])
	{
		ConstructorOverloading ao= new ConstructorOverloading(12.0f,14);
		
		ConstructorOverloading ao1= new ConstructorOverloading(16.5,11);
		
	}

}
