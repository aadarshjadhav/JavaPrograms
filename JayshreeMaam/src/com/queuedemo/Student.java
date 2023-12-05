package com.queuedemo;

public class Student implements Comparable<Student>{
	
	String name;
	int studid;
	
	public Student(String name, int studid) {
		super();
		this.name = name;
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studid=" + studid + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		if(this.studid>o.studid)
			return 1;
		else if(this.studid<o.studid)
			return -1;
		else
			return 0;
	}
	
	

}
