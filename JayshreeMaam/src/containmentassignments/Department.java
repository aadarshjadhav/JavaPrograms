package containmentassignments;

public class Department {
	 int id;
	 String name;
	 Student s;
	
	public Department()
	{
		id=0;
		name="";

	}
	Department(int did, String dname, Student s)
	{
		id=did;
		name=dname;
		this.s= s;
	}
	public String toString()
	{
		return "Department ID:" +id+" Department Name:"+name +" Student:"+s ;
	}
	
	
	public static void main(String args[])
	{
	
		Student s= new Student(1," Rohit");
		Department don= new Department(1001," Biology",s);
		System.out.println(don);
		
	}

}
