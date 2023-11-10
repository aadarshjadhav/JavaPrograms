package com.arraydemos;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMaxPercentage {
	
	public static void assignStudentInfo(StudentMaxPercentage st[])
	{
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter the Rolno:");
			Scanner sc= new Scanner(System.in);
			int rollno=sc.nextInt();
			System.out.println("Enter the Name:");
			String name=sc.next();
			System.out.println("Enter the Marks of 2 subjects:");
			double marks[]= new double[2];
			for(int j=0;j<st.length;j++)
			{
				marks[j]=sc.nextInt();
			}
		}
		
		findMaxPercentage(st);
				
	}
	
	public static void findMaxPercentage(StudentMaxPercentage st[])
	{
		for(int i=0;i<st.length;i++)
		{
			
		}
	}
	

	public static void main(String args[])
	{
		StudentMaxPercentage st[]= new StudentMaxPercentage[2];
		
		//for(int i=0;i<st.length;i++)
			assignStudentInfo(st);
			System.out.println(Arrays.toString(st));
	}
}
