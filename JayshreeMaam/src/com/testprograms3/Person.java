package com.testprograms3;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
	
	int pid;
	String pname;
	Vehicle v[];
	
	public Person()
	{
		pid=0;
		pname="";
	//	v= new Vehicle[];  //Doubt: What should we assign defaultt value for an array of object
	}

	public Person( int pid, String pname, Vehicle v[])
	{
		this.pid=pid;
		this.pname=pname;
		this.v= v;
	}
	
	public int getPid()
	{
		return pid;
	}
	
	public String getPname()
	{
		return pname;
	}
	
	public Vehicle[] getVehicle()
	{
		return v;
	}
	
	public void setPid(int pid)
	{
		this.pid=pid;
	}
	
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	
	public void setVehicle(Vehicle v[])
	{
		this.v=v;
	}
	
	public String toString()
	{
		return "Person ID:"+ pid+ " Person Name:"+ pname + Arrays.toString(v);
	}
	
	public static void main(String args[])
	{
		
		Person p[]= new Person[3];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Person();
			System.out.println("Enter the Person ID:");
			p[i].setPid(sc.nextInt());
			
			System.out.println("Enter the Person Name:");
			p[i].setPname(sc.next());
			
			System.out.println("Enter the Person Vehicle:");
			
	
			System.out.println("Enter the Number of vehicles:");
			int vehicle_no=sc.nextInt();
			Vehicle v[]= new Vehicle[vehicle_no];
			
			for(int j=0;j<vehicle_no;j++)
			{
				v[j]=new Vehicle();
				p[i].setVehicle(v);
				System.out.println("Enter the Vehicle ID and Name for Vehicle No "+ j+1+":");
				v[j].setVid(sc.nextInt());
				v[j].setVname(sc.next());
				
				p[i].setVehicle(v);
			
			}
		}
		for(int i=0;i<p.length;i++) 
		{
			System.out.println(p[i]);
		}
		
	}
}
