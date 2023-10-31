package com.inheritencedemo;

public class MyDate {

	private int dd,mm,yy;
	public MyDate()
	{
		System.out.println("Default constructor Mydate");
		dd=17;
		mm=10;
		yy=2023;
	}
	
	public MyDate(int dd, int mm, int yy)
	{
		System.out.println("Parameterized constructor of MyDate");
	
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void setDd(int d)
	{
		dd=d;
	}
	
	public void setMm(int m)
	{
		mm=m;
	}
	
	public void setYy(int y)
	{
		yy=y;
	}
	
	public int getDd()
	{
		return dd;
	}
	
	public int getMm()
	{
		return mm;
	}
	
	public int getYy()
	{
		return yy;
	}
	
	public void setData(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String args[])
	{
		System.out.println("I am in main");
		//Object creation
		MyDate obj= new MyDate();
		System.out.println(obj);
		obj.setDd(18);
		obj.setMm(12);
		obj.setYy(2023);
		
		System.out.println(obj);
	}
}
