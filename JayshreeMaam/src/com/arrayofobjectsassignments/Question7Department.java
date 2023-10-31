package com.arrayofobjectsassignments;

public class Question7Department {
	
	int did;
	String dname;
	
	public Question7Department ()
	{
		did=0;
		dname=" ";
	}
	
	public Question7Department(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	public void setName(String dname)
	{
		this.dname= dname;
	}
	
	public void setDid(int did)
	{
		this.did=did;
	}
	
	public String getName()
	{
		return this.dname;
	}
	
	public int getDid()
	{
		return this.did;
	}
	
	
	public String toString()
	{
		return  " Department ID:" + did+" Department name:"+ dname;
	}

}
