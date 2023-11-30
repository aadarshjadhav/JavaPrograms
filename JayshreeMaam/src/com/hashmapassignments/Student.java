package com.hashmapassignments;

public class Student {
	
	int student_id;
	String student_name;
	double marks;
	
	public Student()
	{
		
	}
	
	public Student(int student_id, String student_name, double marks) 
	{
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.marks = marks;
	}

	public int getStudent_id() 
	{
		return student_id;
	}

	public void setStudent_id(int student_id) 
	
	{
		this.student_id = student_id;
	}

	public String getStudent_name() 
	{
		return student_name;
	}

	public void setStudent_name(String student_name) 
	{
		this.student_name = student_name;
	}

	public double getMarks() 
	{
		return marks;
	}

	public void setMarks(double marks) 
	{
		this.marks = marks;
	}

	@Override
	public String toString() 
	{
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", marks=" + marks + "]";
	}
	
	
	
	

}
