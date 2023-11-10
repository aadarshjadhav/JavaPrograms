package com.clonedemos;

public class ShallowCopyInExample {
	
	public static void main(String args[])
	{
		Course science =new Course("Physics", "Chemistry", "Biology");
		
		Student student1= new Student(111,"Johnny", science);
		Student student2=null;
		
		try
		{
			//Creating a clone of student1 and assigning it to student2
			student2= (Student) student1.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
        //Printing the subject3 of 'student1
		System.out.println(student1.course.subject3); //Output: Biology
		
		//Changing the subject3 of student2(which is a clone object of student 1)
		
		student2.course.subject3="Maths";
		
		//This will be reflected back to the original student i.e. 'student1'
		
		System.out.println(student2.course.subject3);  //Output: Maths
		
	}

}
