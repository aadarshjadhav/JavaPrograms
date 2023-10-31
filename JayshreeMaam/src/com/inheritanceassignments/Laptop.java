package com.inheritanceassignments;

public class Laptop {
	
	int noOfUSBPort,processorSpeed;
	
	public Laptop()
	{
		noOfUSBPort=0;
		processorSpeed=0;
	}
	
	public Laptop(int noOfUSBPort, int processorSpeed)
	{
		this.noOfUSBPort=noOfUSBPort;
		this.processorSpeed=processorSpeed;
	}
	
	//Setters
	public void setNoOfUSBPort(int noOfUSBPort)
	{
		this.noOfUSBPort=noOfUSBPort;
	}
	
	public void setProcessorSpeed(int processorSpeed)
	{
		this.processorSpeed=processorSpeed;
	}
	
	//Getters
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	
	public int getProcessorSpeed()
	{
		return processorSpeed;
	}
	
//	public String toString()
//	{
//		return "No of USB:" +noOfUSBPort + " Processor Speed:"+processorSpeed ;
//	}
	
	public static void main(String args[])
	{
		Laptop p= new Laptop();
		
		p.setNoOfUSBPort(3);
		p.setProcessorSpeed(4);
		
		System.out.println("No of USB:" + p.getNoOfUSBPort() + " Processor Speed:"+ p.getProcessorSpeed());
	}
	
}
