package methodassignments;
/*1.
add method displayData inside Student class change
values of id name in that method & also print the changed
values in same method. Call displayData method from
main method and see the output. Observe displayData can
only be called by creating object of Student*/

import java.util.Scanner;

public class Student {
	private int identity;
	private String name;
	
	//CONSTRUCTOR
	public Student()
	{
		identity=1234;
		name="Gosling";
	}
	public int getId()
	{
		return 10;
	}
	
	public void displayData(int ident, String nam)
	{
		System.out.println("Inside display method");
		System.out.println("Values before changing:" + "Id:"+ident+" Name:"+ nam);
		
		ident=2;
		nam="Jay";

		System.out.println("Values after changing:" +"Id:" +ident+" Name:"+nam);
		
		ident=getId();
		System.out.println("ID After calling getId():"+ident );
		
	}
	
	public void setCustomData(int customId, String customName)
	{
		identity=customId;
		name=customName;
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Before going to display method");
		
		Student st= new Student();
		st.displayData(1,"Rohit");
			
		Student st1= new Student();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the identity and name:");
		int id= sc.nextInt();
		String nm=sc.next();
		
		st1.setCustomData(id, nm);
		System.out.println("Identity:"+st1.identity+ " Name: "+st1.name);
	
	}

}
