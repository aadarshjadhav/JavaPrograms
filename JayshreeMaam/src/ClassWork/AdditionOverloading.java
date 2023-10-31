package ClassWork;

public class AdditionOverloading {
	
	public void add(double a, double b)
	{
		System.out.println("inside double");
		System.out.println("Addititon integer:"+ (a+b));
	}
	
	public void add(float a, float b)
	{
		System.out.println("inside float");
		System.out.println("Addititon integer:"+ (a+b));
		
	}
	
	public static void main(String args[])
	{
		AdditionOverloading ao= new AdditionOverloading();
		
		ao.add(14.5, 7);
		ao.add(11, 3);
	}

}
