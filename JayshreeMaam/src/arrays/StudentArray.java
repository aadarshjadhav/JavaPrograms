package arrays;
import java.util.Scanner;

public class StudentArray {
	
	private int rollno;
	private String name;
	private	float percentage;
	private char grade;
	int subject[] = new int[5];
	
	//Array Creation and Entering subjects marks
	public void studentInfo()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter student rollno:");
		rollno=sc.nextInt();
		
		System.out.println("Enter student name:");
		name=sc.next();
		
		System.out.println("Enter the 5 subject marks:");
		for(int i=0;i<5;i++)
		{
			subject[i]=sc.nextInt();
		}
		
	}
	
	public void percentage()
	{
		float sum=0;
		for(int i=0;i<subject.length;i++)
		{
			sum+= subject[i];
		}
		
		percentage=((sum/500)*100);
	}
	
	public void grades()
	{
		if(percentage>=90)
			grade='A';
		else if(percentage>=80 && percentage<90)
			grade='B';
		else if(percentage>=70 && percentage<80)
			grade='C';
		else if(percentage>=60 && percentage<70)
			grade='D';
		else
			grade='E';
	}
	
	//Display Method
	public void printStudentInfo()
	{
		System.out.println("Student rollno:" + rollno);
		System.out.println("Student Name:" +name);
		System.out.println("Marks of subjects:");
		
		for(int i=0;i<subject.length;i++)
			System.out.println("Subject"+ (i+1)+":"+subject[i]);
	
		System.out.println("Percentage:"+percentage);
		System.out.println("Grade:"+ grade);
		
	}
	
	//Main Method
	public static void main(String args[]) 
	{
		StudentArray sa= new StudentArray();
		sa.studentInfo();
		sa.percentage();
		sa.grades();
		sa.printStudentInfo();
	}

}
