package com.maphashmap;

public class Department {
	
	  int deptid;
	  String deptname;
	  String location;
	  
	  public Department()
	  {
		  
	  }
	
	  public Department(int deptid, String deptname, String location) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.location = location;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location + "]";
	}
	
	@Override
	public int hashCode()
	{
		return deptid;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Department d= (Department) obj;
		if(this.deptid==d.deptid && this.deptname==d.deptname && this.location==d.location)
			return true;
		else
			return false;
	}
	  

}
