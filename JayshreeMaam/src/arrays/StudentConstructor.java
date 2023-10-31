package arrays;
import java.util.Scanner;

public class StudentConstructor {
	
	//Data members
	private int rollno;
	private String name;
	private	float percentage;
	private char grade;
	int subject[] = new int[5];
	
	//Constructor 
	
	public StudentConstructor(int r, String n, int arr[])
	{
		
		rollno=r;
		name=n;
		subject= arr;
		System.out.println("Inside constructor");
	}
	
	
	
	//Display StudentInfo
/*	public void printStudent()
	{
		System.out.println("Inside printStudent");
		
		for(int j:subject)
			System.out.println("Marks of subject:" + j);
	}
*/	
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
	
	//Display using ToString
	public String toString()
	{
		return "Rollno:"+ rollno+ " Name:"+ name+" percentage:"+percentage+" grade:" +grade;
	}
	
	public static void main(String args[])
	{
		int subarray[]=new int[5];
		
		System.out.println("Enter the 5 subject marks:");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<subarray.length;i++)
		{
			subarray[i]=sc.nextInt();
		}
		
		StudentConstructor stud= new StudentConstructor(1,"Aadarsh",subarray);
		
		stud.percentage();
		stud.grades();
		//stud.printStudent();
		System.out.println(stud);
		sc.close();
	}
	

}
