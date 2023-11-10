package com.testprograms3;

public class Vehicle {
	int vid;
	String vname;
	
	public Vehicle()
	{
		vid=0;
		vname="";
	}
	
	public Vehicle(int vid, String vname)
	{
		this.vid=vid;
		this.vname=vname;
	}
	
	public int getVid()
	{
		return vid;
	}
	
	public String getVname()
	{
		return vname;
	}

	
	public void setVid(int vid)
	{
		this.vid=vid;
		
	}
	
	public void setVname(String vname)
	{
		this.vname=vname;
	}
	
	public String toString()
	{
		return "Vehicle ID:"+vid+ " Vehicle Nname:"+vname;
	}
	
	

}
