package com.inheritanceassignments;

public class Question2Programmer extends Question1Manager {
	
	String skills;
	Question1Manager qm;
	
	public Question2Programmer()
	{
		skills="";
		qm= new Question1Manager();
	}
	
	public Question2Programmer(String skills, Question1Manager qm)
	{
		this.skills=skills;
		this.qm=qm;
	}
	
	public String toString()
	{
		return "Skills:" + skills + qm;
	}
	
	public static void main(String args[])
	{
		//Multilevel Complete
		Question1Employee qemp = new Question1Employee(1001, 25000);
		Question1Manager qm= new Question1Manager(5000, qemp);
		Question2Programmer prog= new Question2Programmer("C++", qm);
		
		
		System.out.println(prog);
	}

}
