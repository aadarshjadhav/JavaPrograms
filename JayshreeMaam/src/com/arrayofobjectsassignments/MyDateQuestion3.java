package com.arrayofobjectsassignments;

public class MyDateQuestion3 {
	
	int dd, mm, yy;
	
	public MyDateQuestion3()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	
	public MyDateQuestion3(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString()
	{
		return dd+ "/"+mm+"/"+yy;
	}
}
