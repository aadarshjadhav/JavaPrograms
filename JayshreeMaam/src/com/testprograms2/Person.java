package com.testprograms2;

public class Person {
	int id;
	String name;
	long mobile;
	Job job;
	
	public Person()
	{
		job= new Job();
	}
	
	public Person(int id, String name, long mobile, Job job)
	{
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.job=job;
	}
	
	public String toString()
	{
		return " ID:"+id+" name:"+name+ " mobile:"+ mobile+ " Job:"+ job;
	}
	
	public static void main(String args[])
	{
		Person p= new Person(101,"Rohit", 243425223, new Job(10001,"Dev",25000));
		Person p2= new Person(102,"Jay", 99999999, new Job(10002,"HR",25000));
		
		System.out.println(p);
		System.out.println(p2);
	}

}
