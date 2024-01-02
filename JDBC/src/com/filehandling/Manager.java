package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public  class Manager extends Employee //implements Serializable
{
	int noofemp;
	double bonus;
	
	public Manager() {
		// TODO Auto-generated constructor stub
		super( );
		System.out.println("default con. of Manager1");
		noofemp=0;
		bonus=0.0;
	}
	public Manager(int eid, String name, double sal, MyDate d, int noofemp, double bonus)
	{
		super(eid,name,sal,d);
		System.out.println("Parameterized cons of Manager");
		this.noofemp=noofemp;
		this.bonus=bonus;
	}
	
	public int getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double calculateSalary() {
		double s= super.getSalary()  + noofemp*bonus;
		super.setSalary(s);
		return s;
	}
	public String toString()
	{
		
		return super.toString()+" No of Employee "+noofemp + " Bonus "+bonus;
	
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		// TODO Auto-generated method stub
		Manager obj = new Manager(03,"Suraj", 50000,new MyDate(25,10,2023),100,100.5);
		obj.calculateSalary();
		//System.out.println(obj);
		
		FileOutputStream fos=new FileOutputStream(".//src//com//filehandling//Manager.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(obj);
		System.out.println("Object Saved");
		
		FileInputStream fis=new FileInputStream(".//src//com//filehandling//Manager.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Manager obj1=(Manager)ois.readObject();
		
		ois.close();
		fis.close();
		System.out.println(obj1);
			
			
	}

}

