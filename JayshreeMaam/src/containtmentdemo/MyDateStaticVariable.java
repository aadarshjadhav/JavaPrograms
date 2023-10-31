package containtmentdemo;

import ClassWork.MyDate;

public class MyDateStaticVariable {
	
	private int dd,mm,yy;
	
	public MyDateStaticVariable()
	{
		dd=12;
		mm=10;
		yy=2023;
	}
	
	public MyDateStaticVariable(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public MyDateStaticVariable getObject()
	{
		//return new MyDateStaticVariable(18,10,2023);
		this.dd=20;
		this.mm=30;
		this.yy=2023;
		return this;
	}
	
	public void printDate()
	{
		System.out.println("Day: "+ dd+ " month:" +mm+" year:"+yy);
		
	}
	
	public String toString()
	{
		return "Date:"+dd +" Month:"+ mm+ " Year:" +yy;
	}
	public static void main(String args[])
	{
		MyDateStaticVariable obj= new MyDateStaticVariable();
		obj.printDate();
		MyDateStaticVariable o=obj.getObject();
		o.printDate();
		
	}
}
