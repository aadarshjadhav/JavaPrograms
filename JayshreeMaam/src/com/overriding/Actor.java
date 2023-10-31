package com.overriding;

public class Actor extends Person{
	
	public Actor()
	{
		
	}
	@Override
	public void readScript()
	{
		System.out.println("Inside Class Actor readscript methhod");
	}
	
	public static void main(String args[])
	{
		Person p= new Actor();
		p.readScript();
	}

}
