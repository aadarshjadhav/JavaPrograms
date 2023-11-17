package diwalitest5;

public class Child extends Parent{
	
	public static void addMethod()
	{
		System.out.println("In child method");
	}
	
	public void subMethod()
	{
		System.out.println("In child sub-method");
	}
	
	public static void main(String args[])
	{
		Parent p= new Child();
		p.addMethod();
	//	p.subMethod();
		
		Parent[] p2= new Parent[4].clone();
	}

}
