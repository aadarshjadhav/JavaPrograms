package com.inheritanceassignments;

public class Strawberry extends Cake{
	
	double strawberry_price;
	Cake c;
	public Strawberry()
	{
		strawberry_price=0;
		c= new Cake();
	}
	
	public Strawberry(double strawberry_price, Cake c)
	{
		this.strawberry_price=strawberry_price;
		this.c=c;
	}
	
	public static void main(String args[])
	{
		Strawberry sb= new Strawberry();
		sb.bake();
	}

}
