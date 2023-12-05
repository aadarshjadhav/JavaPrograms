package com.testingtopics;

import java.util.ArrayList;

public class Student{
	
	int rollno;

	
	
	public Student()
	{
		
	}
	
	public Student (int rollno)
	{
		this.rollno=rollno;
	
		
	}

	public int getRollno()
	{
		return rollno;
	}
	
	public void setRollno(int rollno)
	{
		this.rollno= rollno;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "Student [rollno=" + rollno + "]";
	}
}
	
//	//@Override
//	public int compareTo(Student o)  //Here Object o is changed to Student o
//	{
////		int res=this.name.compareTo(o.name);
////		System.out.println(res);
////		return res;
//		if(this.rollno==o.rollno)
//			return 0;
//		else if(this.rollno<o.rollno)
//		{
//			return -1;
//		}
//		else
//		{
//			return 1;
//		}
//	}

	/*When you call Collections.sort(list) on a list of objects, 
	 * the sort method uses a sorting algorithm 
	 * to arrange the elements in the list based on the order determined by the compareTo method, 
	 * which is implemented by the class of the elements in the list.*/

