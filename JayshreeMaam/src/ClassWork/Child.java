package ClassWork;

public class Child extends Parent {
	
	int a=20;
	
	static
	{
		
	}
	void show() 
	{
        System.out.println("abc:");
    }
	void add()
	{
		
	}
	
	public Child()
	{
		final int abc=10;
	}
	
	public Child(int a, int b)
	{
		
	}
	
	public static void main(String args[])
	{
		Parent p = new Child(); // Polymorphism
        p.show();
        System.out.println( p.a); 
        Child c= new Child(10, 20);
        
	}
	
}
