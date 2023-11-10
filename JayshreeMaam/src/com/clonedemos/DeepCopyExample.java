package com.clonedemos;

public class DeepCopyExample {
	
	public static void main(String args[])
	{
		CourseDeep science= new CourseDeep("Physics", "Chemistry", "Biology");
		
		StudentDeep student1= new StudentDeep(111, "John", science);
		
		StudentDeep student2=null;
		
		try
		{
			//creating a clone and assigning it to student
			student2 = (StudentDeep) student1.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		//Printing the subject3 of student1
		
		System.out.println(student1.course.subject3); //Output: Biology
		
		//Changing the subject3 of student2
		student2.course.subject3="Maths";
	
		
		//This change will not be reflected in original student student1
		System.out.println(student1.course.subject3);       //Output : Biology
		
		System.out.println(student1.name);
    
	}

}
