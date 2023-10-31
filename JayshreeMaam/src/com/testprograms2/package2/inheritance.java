package com.testprograms2.package2;

import com.testprograms2.package1.A;

public class inheritance extends A{
	
	public inheritance()
	{
		
		
	}

	void display() 
	{
        super.k =1;
        System.out.println(super.k);
    }
	
    public static void main(String args[])
    {
        B b = new B();
        A a=new A();
        inheritance in= new inheritance();
        
        a.i=10;
        a.k=90; //Doubt: Why a.k is not accessible? but in.k is?
        
        b.i=1;
        b.j=2; 
        
        in.k=10;
        
    }
}
