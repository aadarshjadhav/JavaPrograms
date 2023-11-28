package com.arraylistdemos;

public class Department {
	
	int depid;
	String depname;
	String location;
	
	public Department()
	{
		
	}
	
	public Department(int depid, String depname, String location) {
		
		this.depid = depid;
		this.depname = depname;
		this.location = location;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", location=" + location + "]";
	}
	
	
}
