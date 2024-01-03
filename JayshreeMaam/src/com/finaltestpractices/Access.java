package com.finaltestpractices;

class Access {						
	
	static int x;       
	
	void increament()                 
	{       
		System.out.println("Before increment of x:"+x);
		x = ++x ;   
		System.out.println("After increment of x:"+x);
	}
}										           

