package com.testprograms2;

public class Nib {
	String materialType;
	int width;
	
	public Nib()
	{
		
	}

	public Nib(String materialType, int width)
	{
		this.materialType=materialType;
		this.width=width;
	}
	
	public void setMaterial(String materialType)
	{
		this.materialType= materialType;
	}
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	
	public String getMaterial()
	{
		return materialType;
	}
	
	public int geWidth()
	{
		return width;
	}
	
	public String toString()
	{
		return "materialType:"+materialType+ "width: "+ width ;
	}
}
