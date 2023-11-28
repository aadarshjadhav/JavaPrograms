package com.arraylistdemos;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
	
	int rollno;
	String name;
	ArrayList<Integer> marks;
	double percentage;
	String grade;
	
	public Student()
	{
		
	}
	
	public Student (int rollno, String name, ArrayList<Integer> l)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=l;
		calculatePercentage();
		calculateGrade();
	}

	public int getRollno()
	{
		return rollno;
	}
	
	public void setRollno(int rollno)
	{
		this.rollno= rollno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void calculatePercentage()
	{
		int sum=0;
		for(int m:marks)
			sum=sum+m;
		this.percentage=(sum/500)*100;
	}
	
	public void calculateGrade()
	{
		if(this.percentage>=90)
    		this.grade="A+";
    	else if(this.percentage>=80)
    		this.grade="A";
    	else if(this.percentage>=70)
        		this.grade="B";
    	
    	else if(this.percentage>=60)
    		this.grade="C";
    	else
    		this.grade="D";

	}

	public static void main(String[] args) 
	{
		//Main method

	}
	
	@Override
	public String toString() 
	{
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", percentage=" + percentage
				+ ", grade=" + grade + "]";
	}
	
	//@Override
	public int compareTo(Student o)  //Here Object o is changed to Student o
	{
//		int res=this.name.compareTo(o.name);
//		System.out.println(res);
//		return res;
		if(this.rollno==o.rollno)
			return 0;
		else if(this.rollno<o.rollno)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

	/*When you call Collections.sort(list) on a list of objects, 
	 * the sort method uses a sorting algorithm 
	 * to arrange the elements in the list based on the order determined by the compareTo method, 
	 * which is implemented by the class of the elements in the list.*/
}
