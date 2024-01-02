package com.designpattern;

public class SingletonDemo {
	
	// Java program implementing singleton class
	//with getInstance() method

	
	//static variable single_instance of type Singleton
	private static SingletonDemo single_instance;
	
	//variable of type String
	public String s;
	
	private SingletonDemo()
	{
		s= "Hello I am a string part of Singleton Class";
		
	}
	
	//static method to create instance of Singleton class
	public static SingletonDemo getInstance ()
	{
		if(single_instance == null)
			single_instance = new SingletonDemo(); //Lazy initialization
	
		return single_instance;

	}

}
