package com.testprograms2;

public class Refill {
	
	String inkColour;
	int length;
	Nib tip;
	
	public Refill()
	{
		tip= new Nib();
	}
	
	public void setinkColour( String inkColour)
	{
		this.inkColour=inkColour;
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	
	public void setNib(Nib tip)
	{
		this.tip= tip;
	}
	
	public String getInk()
	{
		return inkColour;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public Nib getNib()
	{
		return tip;
	}
	
	public String toString()
	{
		return "inkcolour:"+inkColour+ "Length: "+ length + tip ;
	}
}
