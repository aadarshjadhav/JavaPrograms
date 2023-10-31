package com.inheritanceassignments;

public class BlackForest extends Cake {
	
	Cake c;
	double black_forest_price;
	
	public BlackForest() 
	{
		black_forest_price=0;
		c= new Cake();
	}
	
	public BlackForest(double black_forest_price, Cake c)
	{
		this.black_forest_price=black_forest_price;
		this.c=c;
	}
	
	public static void main(String args[])
	{
		BlackForest bf= new BlackForest();
		bf.bake();
		
	}
}
