package com.testprograms2;

public abstract class Teacher {

	int tid;
	int tname;
	long mobile;
	
	public Teacher()
	{
		
	}
	
	public Teacher(int tid, int tname, long mobile)
	{
		this.tid=tid;
		this.tname=tname;
		this.mobile=mobile;
	}
	
	abstract void salary();
}
