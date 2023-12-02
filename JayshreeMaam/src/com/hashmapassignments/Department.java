package com.hashmapassignments;

public class Department {
	
	int dep_id;
	String dep_name;
	String location;
	
	public Department()
	{
		
	}
	
	public Department(int dep_id, String dep_name, String location) 
	{
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.location = location;
	}

	public int getDep_id() 
	{
		return dep_id;
	}

	public void setDep_id(int dep_id) 
	{
		this.dep_id = dep_id;
	}

	public String getDep_name() 
	{
		return dep_name;
	}

	public void setDep_name(String dep_name) 
	{
		this.dep_name = dep_name;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}

	@Override
	public String toString() 
	{
		return "Department [dep_id=" + dep_id + ", dep_name=" + dep_name + ", location=" + location + "]";
	}
	
//	@Override
//	public int hashCode()
//	{
//		return dep_id;
//	}
//	
//	@Override
//	public boolean equals(Object obj)
//	{
//		Department d= (Department) obj;
//		if(this.dep_id==d.dep_id && this.dep_name==d.dep_name && this.location==d.location)
//			return true;
//		else
//			return false;
//	}
//	

}
