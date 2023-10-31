package com.inheritencedemo;

public class ElectronicDevice {
	
	int price;
	String modelnumber;
	String devicetype;
	String dateofmanu;
	String os;
	
	public ElectronicDevice()
	{
		price=0;
		modelnumber="";
		devicetype="";
		dateofmanu="";
		os="";
	}
	
	public ElectronicDevice(int price, String modelnumber, String devicetype, String dateofmanu, String os)
	{
		this.price=price;
		this.modelnumber=modelnumber;
		this.devicetype=devicetype;
		this.dateofmanu=dateofmanu;
		this.os=os;
	}
	
	public static void main(String args[])
	{
		
	}
	

}
