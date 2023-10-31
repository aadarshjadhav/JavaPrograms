package com.arrayofobjectsassignments;
import java.util.Scanner;
/* 
6)Write a Java program to create array of Employee objects.
Employee class has empNo , name. Array size should be 5.Make use of for loop.
*/

public class CreateArrayOfObjects {
	
	int empNo;
	String name;
	
	public CreateArrayOfObjects()
	{
		empNo=0;
		name="";
	}
	
	public CreateArrayOfObjects(int empNo, String name)
	{
		this.empNo=empNo;
		this.name=name;
	}
	
	public String toString()
	{
		return " Employee ID:" +empNo+ " Employee name:"+name;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		CreateArrayOfObjects emp[]= new CreateArrayOfObjects[5];
		
		System.out.println("Enter the values for 5 employee");
		
		for(int i=0; i<emp.length;++i)
		{
			emp[i] = new CreateArrayOfObjects();
			emp[i].empNo= sc.nextInt();
			emp[i].name=sc.next();
		}
		
		for(int i=0; i<emp.length;++i)
		{
			System.out.println(emp[i]);
		}
	}
	
}
