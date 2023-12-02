package com.hashmapassignments;

import java.util.ArrayList;

public class Student1 {
	
	int rollno;
	String name;
	double percentage;
	String grade;
	ArrayList<Integer> marks;
	
	
	public Student1(int rollno, String name, ArrayList<Integer> marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
		this.percentage = calculatePercentage();
		this.grade = calculateGrade();
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", grade=" + grade
				+ ", marks=" + marks + "]";
	}
	
	public double calculatePercentage()
	{
		double sum=0;
		for(int i:marks)
			sum=sum+i;
		
		percentage=(sum*100/500);
		return percentage;
		
	}
	
	public String calculateGrade()
	{
		if(percentage>90)
    		grade="A";
    	else if(percentage >80)
    		grade="B";
    	else if(percentage>70)
    		grade="C";
    	else if(percentage>60)
    		grade="D";
    	else if(percentage>50)
    		grade="E";
    	else
    		grade="F";
    	return grade;

		
		
	}

	

}
