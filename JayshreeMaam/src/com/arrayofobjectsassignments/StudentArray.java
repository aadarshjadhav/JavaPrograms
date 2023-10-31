package com.arrayofobjectsassignments;

public class StudentArray {
	
	int roll, age, marks;
	String name;
	
	public StudentArray()
	{
		roll=0;
		age=0;
		marks=0;
		name=" ";
	}
	
	public StudentArray(int roll, int age, int marks, String name)
	{
		this.roll=roll;
		this.age=age;
		this.marks=marks;
		this.name=name;
	}
	
	public String toString()
	{
		return "Rollno:"+roll+ " Age:"+ age+ " marks:"+marks+ " name:"+name;
	}
	
	public static void main(String args[])
	{
		StudentArray st[]= new StudentArray[4];
		st[0]= new StudentArray(1,14,70,"Rohit");
		st[1]= new StudentArray(2,15,66,"Abhijeet");
		st[2]= new StudentArray(3,14,65,"Daya");
		st[3]= new StudentArray(4,16,61,"Vivek");
		
		for(int i=0; i<st.length;i++)
		{
			if(st[i].age<15 && st[i].marks>60)
				System.out.println(st[i]);
		}
		
	}
}
