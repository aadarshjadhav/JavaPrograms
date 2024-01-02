package com.innerconcepts.Anonymous;

public class Outer {
	
	Demo d=new Demo()
			{
				//A.I.C subclass of demo
				int ai=20;
				{
					System.out.println("In instance init block");
				}
				
				public void show()
				{
					super.show();
					System.out.println("In AIC show"+ai);
					newMethodAIC();
				}
				
				public void newMethodAIC()
				{
					System.out.println("n new method");
				}
			};
			
	
	Myinterface ii=new Myinterface()		
			{
				//A.I.C type interface implements
				
				@Override
				public void test() 
				{
					System.out.println("This is test of A.I.C");
				}
				
			};
	
	public void show()
	{
		Demo d=new Demo()
		{
	
	
		};
	}

	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.d.show();
		o.ii.test();
		
	}

}



class Demo
{
	int data= 10;
	public Demo()
	{
		
	}
	
	public void show()
	{
		System.out.println("From Demo Class show"+data);
	
	}
}

interface Myinterface
{
	public void test();
	//public void check();
}