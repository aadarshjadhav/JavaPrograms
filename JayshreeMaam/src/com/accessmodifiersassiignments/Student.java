package com.accessmodifiersassiignments;

public class Student {
	
	 public int rollNo;
	 protected int courseId;
	 int admissionNo; 
	 private int age;
	 
	 public void doPublic()
	 {
		System.out.println();
	 }

	 int doDefault()
	 {
		 return courseId;
	 }
	 
	 protected int doProtected() 
	 {
		 
	 }
	 private int doPrivate()
	 {
		 
	 }
}
