package com.hashsetassignmentns;

import com.hashsetdemos.Employee;

public class Student {
	
	int studid;
	String studname;
	
	public Student(int studid, String studname) {
		super();
		this.studid = studid;
		this.studname = studname;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + "]";
	}
	
	@Override
	public int hashCode()
	{
		return studid;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Student s=(Student) obj; //Type casting is needed
		if(this.studid==s.studid && this.studname==s.studname && this.studname==s.studname)
			return true;
		else
			return false;
	}

}
