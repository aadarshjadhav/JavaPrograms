package containmentassignments;

public class Student {
	private int rollno;
	private String name;
	
	public Student()
	{
		rollno=0;
		name="";
	}
	
	public Student(int rollno, String n)
	{
		this.rollno=rollno;
		name=n;
		
	}
	public String toString()
	{
		return "Student rollno:" + rollno+ "Student name:" +name;
	}
	
	
}
