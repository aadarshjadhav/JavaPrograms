package com.arrayofobjectsassignments;
import java.util.Scanner;
/*1.	WAP to print the employees from Employee[] array who has same salary 
 * (Create Employee class which has 3 attributes id, name, salary and add 
 * employee objects to your array)//Accept id from user and show all emp who
 *  get same sal has given id*/

public class EmployeeArraySameSalary {
	
	int id, salary;
	String name;
	// (Doubt: why cant we declare here)EmployeeArraySameSalary[] emp= new EmployeeArraySameSalary[3];
	
	public EmployeeArraySameSalary()
	{
		id=0;
	}
	
	public EmployeeArraySameSalary(int id, int salary, String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public String toString()
	{
		return " Employee ID:"+id+" Employee Salary:"+ salary+ " Name:"+name;
	}
	
	public static void main( String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		EmployeeArraySameSalary[] emp= new EmployeeArraySameSalary[5];
		
		emp[0]= new EmployeeArraySameSalary(1,20000,"Don");
		emp[1]= new EmployeeArraySameSalary(2,30000,"Don 2");
		emp[2]= new EmployeeArraySameSalary(3,20000,"Don 3");
		emp[3]= new EmployeeArraySameSalary(4,30000,"Don 4");
		emp[4]= new EmployeeArraySameSalary(5,20000,"Don 5");
		
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		
		EmployeeArraySameSalary obj =new EmployeeArraySameSalary() ;
		
		for(int i=0; i<emp.length;i++)
		{
			if(id == emp[i].id)
			{
				obj=emp[i];
				break;
			}
			
		}
		
		//System.out.println(obj);
		if(obj.salary!=0)
		{
			for(int i=0;i<emp.length;i++)
			{
				if(emp[i].salary== obj.salary )
				{
					System.out.println(emp[i]);
				}
			}
		}
		else
		{
			System.out.println("Employee doesn't exists for this id"+ id);
		}
		
		
	}
}
