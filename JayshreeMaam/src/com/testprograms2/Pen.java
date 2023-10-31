package com.testprograms2;

public class Pen {
	
	Refill fill;
	int caplength;
	String brand;
	
	public Pen()
	{
		fill= new Refill();
	}
	
	public void setCaplength(int caplength)
	{
		this.caplength=caplength;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public void setRefill(Refill fill)
	{
		this.fill=fill;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getCaplength()
	{
		return caplength;
	}
	
	public Refill getRefill()
	{
		return fill;
	}
	
	public static void main(String args[])
	{
		Nib tip= new Nib();
		tip.setMaterial("Plastic");
		tip.setWidth(5);
		
		Refill fill=new Refill();
		fill.setinkColour("Red");
		fill.setLength(6);
		
		Pen p= new Pen();
		p.setCaplength(7);
		p.setBrand("Cello");
		
		//Linking the object tip with fill, and fill with p
		fill.setNib(tip);
		p.setRefill(fill); //now all the objects are linked to each other
		
		//Calling getter methods of object p
		System.out.println(p.getBrand());
		System.out.println(p.getCaplength());
		
		//Calling getter methods of object fill
		System.out.println(p.fill.getInk());
		System.out.println(p.fill.getLength());
		
		//Calling getter methods of object tip
		System.out.println(p.fill.tip.getMaterial());
		System.out.println(p.fill.tip.geWidth()); //Or System.out.println(tip.geWidth());
		
		
		//Using toString method to call objects
		System.out.println(p.getRefill()); //Doubt: You need toString for getters and setters method too?
		System.out.println(fill.getNib());
		
	}

}
