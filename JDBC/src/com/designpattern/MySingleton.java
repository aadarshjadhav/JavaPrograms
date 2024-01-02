package com.designpattern;

public class MySingleton {
	
	public static void main(String args[])
	{
        // instantiating Singleton class with variable x
    	//SingletonDemo x1 = new SingletonDemo();
        SingletonDemo x = SingletonDemo.getInstance();
        System.out.println(x.hashCode());
       
        // instantiating Singleton class with variable y
        SingletonDemo y = SingletonDemo.getInstance();
        System.out.println(y.hashCode());
        
        // instantiating Singleton class with variable z
        SingletonDemo z = SingletonDemo.getInstance();
        System.out.println(z.hashCode());
        // changing variable of instance x
        
        
        x.s= " I am from x";
        y.s = "I am from Y";

	    /* // changing variable of instance z
        //z.s = (z.s).toLowerCase();
        z.s = " I am from z" ;
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.gc();*/


	}

}
