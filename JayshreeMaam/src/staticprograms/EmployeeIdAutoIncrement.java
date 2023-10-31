package staticprograms;
import java.util.Scanner;

public class EmployeeIdAutoIncrement {
	
	private int count=0;
	private String name;
	private int employee_id=0;
	
	static String companyname;
	
	static
	{
		companyname="ThinkQuotient";
	}
	EmployeeIdAutoIncrement()
	{
		count++;
	}

	public static void main(String args[])
	{
		boolean status=true;
		
		do {
			System.out.println("Menu:");
			System.out.println("1.Add new employee");
			System.out.println("2.Display");
			
			Scanner sc= new Scanner(System.in);
			int option=sc.nextInt();
			
			EmployeeIdAutoIncrement emp= new EmployeeIdAutoIncrement();
			
			
			switch(option)
			{
				case 1: 
						break;
				case 2:
						break;
				default: System.out.println("Wrong option entered!!!");

				
			}
		
			
			System.out.println("Do you want to go again?:");
			String ans=sc.next();
			
			if(ans=="yes")
			{
				status=true;
				EmployeeIdAutoIncrement emp+1= new EmployeeIdAutoIncrement();
			}
			else
			{
				status=false;
			}
		}while(status==false);
		
	}
}
