package com.arrayofobjectsassignments;
/* WAP to print the employees from Employee[] array who has same joining date. 
 * You have Employee class which has 4 attributes id, name, salary, 
 * date (date is another object which has 3 attributes day, month, year) 
 * and add employee objects to your array*/

public class EmployeeArraySameDOJ {
	
	int id, salary;
	String name;
	SameDOJ doj;
	
	public EmployeeArraySameDOJ()
	{
		id=0;
		salary=0;
		name=" ";
		doj = new SameDOJ();
	}
	
	public EmployeeArraySameDOJ(int id, int salary, String name, SameDOJ doj)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.doj=doj;
	}
	
	public String toString() 
	{
		return " Employee ID:" + id + " Employee Salary:" +salary +" Employee Name:" +name +" DOJ:"+doj;
	}
	
	public static void main(String args[])
	{
		//SameDOJ doj= new SameDOJ();
		EmployeeArraySameDOJ emp[]= new EmployeeArraySameDOJ[4];
		
		emp[0]= new EmployeeArraySameDOJ(1001,20000, "Rohit", new SameDOJ(11,12,2023));
		emp[1]= new EmployeeArraySameDOJ(1002,20000, "Jay", new SameDOJ(12,12,2023));
		emp[2]= new EmployeeArraySameDOJ(1003,20000, "Abhishek", new SameDOJ(11,12,2023));
		emp[3]= new EmployeeArraySameDOJ(1004,20000, "Jitendra", new SameDOJ(11,12,2023));
		
		
		
		for(int i=0;i<emp.length;i++)
		{
			for(int j=0;j<emp.length;j++)
			{
				if(emp[i].doj.compareDate(emp[j].doj) && i!=j)  //Doubt: why i!=j is causing no output to show
				{
					System.out.println(emp[i]);
					break;
				}
			}
		}		
	}
}
