package com.arrayofobjectsassignments;
import java.util.Scanner;

public class Question7Employee {
	
	int empno;
	String name;
	Question7Department d;
	
	public Question7Employee()
	{
		empno=0;
		name="";
		d= new Question7Department();
	}
	
	public Question7Employee(int empno, String name, Question7Department d)
	{
		this.empno=empno;
		this.name=name;
		this.d=d;
	}
	
	public String toString()
	{
		return " Employee ID:" +empno+ " Employee name:"+name + d;
	}
	
	public static void main(String args[])
	{
		Question7Employee qmp[]= new Question7Employee[2];
		Question7Department dp= new Question7Department();
		
		//int depid; 
		//String depname;
		
		System.out.println("Enter the values for 5 employee");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<qmp.length;++i)
		{
			qmp[i] = new Question7Employee();
			dp= new Question7Department();
			
			System.out.println("Enter empno and name:");
			qmp[i].empno= sc.nextInt();
			qmp[i].name=sc.next();
			
			System.out.println("Enter did and dname:");
			//depid= sc.nextInt();
			//depname= sc.next();
			
			qmp[i].d.setDid(sc.nextInt());
			qmp[i].d.setName(sc.next());
			
		}
		
		for(int i=0; i<qmp.length;++i)
		{
			System.out.println(qmp[i]);
		}

	}

}
