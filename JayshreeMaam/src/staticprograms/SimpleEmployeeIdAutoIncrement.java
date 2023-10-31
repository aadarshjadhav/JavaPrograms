package staticprograms;

import java.util.Scanner;

public class SimpleEmployeeIdAutoIncrement {

	static int count;
	private String name;
	private int employee_id;
	
	static String companyname;
	
	static	//Static Block
	{
		companyname="ThinkQuotient";
	}
	
	public SimpleEmployeeIdAutoIncrement() // Constructor
	{
		System.out.println("Inside constrcutor:"+count);
		employee_id=++count;
		System.out.println("Going outside constrcutor:"+count);
	}
	
	public void setData(String name)	//SET DATA
	{
		this.name=name;
	}

	public void printData()		//PRINT DATA
	{
		
		System.out.println("Employee ID:" + employee_id+" Name:"+ name +" Company:"+companyname);
	}
	
	//Display using print function
	public String toString()
	{
		return "Employee ID:"+employee_id + "Name:" +name+ "Commpany:"+companyname;
	}
	public static void main(String args[])
	{
		//1st Object Created
		SimpleEmployeeIdAutoIncrement sea= new SimpleEmployeeIdAutoIncrement();
		sea.setData("Aadarsh");
		//sea.printData(); 
		
		//2nd Object Created
		SimpleEmployeeIdAutoIncrement sea2= new SimpleEmployeeIdAutoIncrement();
		sea2.setData("Rohit");
		//sea2.printData();
		
		System.out.println(sea);
		System.out.println(sea2);
	}

}
