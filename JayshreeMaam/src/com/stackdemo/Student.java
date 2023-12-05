package com.stackdemo;

public class Student{
	
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


	
	

}
