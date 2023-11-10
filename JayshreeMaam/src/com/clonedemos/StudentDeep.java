package com.clonedemos;

public class StudentDeep  implements Cloneable  {
	
	int id;
	 
    String name;
 
    CourseDeep course;
 
    public StudentDeep(int id, String name, CourseDeep course)
    {
        this.id = id;
 
        this.name = name;
 
        this.course = course;
    }
    
	
	public Object clone() throws CloneNotSupportedException
    {
		StudentDeep student = (StudentDeep) super.clone();
 
        student.course = (CourseDeep) course.clone();
 
        return student;
    }


}
