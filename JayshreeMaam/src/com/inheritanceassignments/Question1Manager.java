package com.inheritanceassignments;

public class Question1Manager extends Question1Employee{
	
		double bonus;
		Question1Employee qemp;
		
		public Question1Manager()
		{
			bonus=0;
			qemp= new Question1Employee();
		}
		
		public Question1Manager(double bonus, Question1Employee qemp)
		{
			this.bonus=bonus;
			this.qemp=qemp;
		}
		
		public String toString()
		{ //Showing error when only values are returned
			return " Bonus"+bonus+ " Employee details:"+qemp;
		}
	
		public static void main(String args[])
		{
			//Question1Employee qemp = new Question1Employee(1001, 25000);
			//Question1Manager qm= new Question1Manager(5000, qemp);
			
			
			//System.out.println(qm);
			
		}
}
