package ClassWork;
import java.util.Scanner;

public class StudentClass {
	
	private double roll, sub1,sub2,sub3,sub4,sub5;
	private double percentage;
	private String grade;
	private String name;
	
	public void percentage()
	{
		percentage= ((sub1+sub2+sub3+sub4+sub5)/500)*100;
		
	}

	public void grade()
	{
		if(percentage>90)
			grade="A";
		else if(percentage>70 && percentage<80)
			grade="B";
		else if(percentage>60 && percentage<70)
			grade="C";
		else if(percentage<60 && percentage>50)
			grade="D";
		else
			grade="E";
	}
	
	public void setData(int r, int s1, int s2, int s3, int s4, int s5, String n)
	{
		roll=r;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
		sub5=s5;
		name=n;
		
		
	}
	
	public void display()
	{
		System.out.println("Percentge: "+ percentage + " Grade:" + grade);
	}
	public static void main(String args[])
	{
		StudentClass st;
		st= new StudentClass();
		
		st.setData(1001,56,67,65,45,55,"Vicky");
		st.percentage();
			
		st.grade();
		st.display();
		
		
	}
}
