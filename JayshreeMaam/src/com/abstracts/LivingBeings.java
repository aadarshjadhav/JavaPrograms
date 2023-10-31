package com.abstracts;

public class LivingBeings {

	public static void main(String args[])
	{
		Animal an= new Tiger();
		Animal an2= new Elepphant();
		
		an.eat();
		an2.eat();
		an.a=10;
		System.out.println(an.a);
	}
}
