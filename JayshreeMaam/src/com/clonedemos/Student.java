package com.clonedemos;

class Student implements Cloneable
{
    int id;
 
    String name;
 
    Course course;
 
    public Student(int id, String name, Course course)
    {
        this.id = id;
 
        this.name = name;
 
        this.course = course;
    }
    
    //Using the default version of clone() method which will create a shallow copy of an object.
    
    public Object clone() throws CloneNotSupportedException
    {
    	return super.clone();
    }	

}
