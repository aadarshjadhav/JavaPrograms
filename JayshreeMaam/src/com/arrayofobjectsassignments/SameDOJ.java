package com.arrayofobjectsassignments;

public class SameDOJ {

	int dd, mm,yy;
	
	public SameDOJ()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	
	public SameDOJ(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public boolean compareDate( SameDOJ obj)
	{
		if(this.dd== obj.dd && this.mm==obj.mm && this.yy==obj.yy)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return "Date:"+ dd+"/"+mm+"/"+yy;
	}
}
