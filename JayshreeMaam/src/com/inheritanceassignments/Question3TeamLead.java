package com.inheritanceassignments;

public class Question3TeamLead extends Question1Manager{
	
	int num_of_team_members;
	Question1Manager qm;
	
	public Question3TeamLead()
	{
		num_of_team_members=0;
		qm= new Question1Manager();
	}
	
	public Question3TeamLead(int num_of_team_members, Question1Manager qm)
	{
		this.num_of_team_members=num_of_team_members;
		this.qm=qm;
	}
	
	public String toString()
	{
		return "Number of team members:"+ num_of_team_members + qm;
	}
	
	public static void main(String args[])
	{
		Question1Manager qm= new Question1Manager();
		Question3TeamLead tl= new Question3TeamLead(5,qm);
		
		System.out.println(tl);
		
	}

}
