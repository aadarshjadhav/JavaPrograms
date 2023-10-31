package ClassWork;

public class Employee {
	
	private String employ_name;
	private double phone;
	private String emp_email;
	float basic_salary;
	float dearness_allowance, house_rent, provident_fund;
	
	//Default COnstructor
	public Employee()
	{
		System.out.println("Inside defalt constructor");
		employ_name="Bond";
		phone = 808656789;
		emp_email="aadarsh@gmail.com";
		
	}
	
	//Parameterized Constructor
	public Employee(String n, double ph, String em)
	{
		System.out.println("Inside Parameterized constructor");
		employ_name=n;
		phone = ph;
		emp_email=em;
	}
	public void hra()
	{
		house_rent= dearness_allowance+basic_salary;
		
	}
	public void da()
	{
		dearness_allowance= basic_salary*(0.15f);
		System.out.println(dearness_allowance);
	}
	public void pf()
	{
		provident_fund=basic_salary - (basic_salary*(0.7f));
	}
	public void setData(String name, long mobile, String email, int salary)
	{
		employ_name=name;
		phone = mobile;
		emp_email=email;
		basic_salary=salary;
		
	}
	
	//Compare Salary of two empolyees
	public float compareSalary(Employee emp4) 
	{
		
		if(this.basic_salary>emp4.basic_salary)
			return this.basic_salary;
		else
			return emp4.basic_salary;
		
	}
	public void display_out()
	{
		System.out.println("PF:"+provident_fund);
		System.out.println("HRA:"+house_rent);
		System.out.println("DA:"+dearness_allowance);
	}
	
	
	public static void main(String args[])
	{
		Employee emp;
		emp = new Employee();
		
		emp.setData("Aadarsh", 8086500878l, "aadarsh@gmail.com", 30000);
		emp.da();
		emp.hra();
		emp.pf();
		emp.display_out();
		
		//Default constructor demo
		Employee emp1;
		emp1 = new Employee();
		
		//Parameterized Constructor demo
		Employee emp2;
		emp2 = new Employee("Gosling",123456789,"gosling@gmail");
		
		//Comparing two salary using objects
		Employee emp3;
		emp3 = new Employee();
		emp3.setData("Vicky", 802391312, "vicky@gmail.com", 40000);
		
		float salary= emp.compareSalary(emp3);
		if(salary==emp.basic_salary)
			System.out.println(emp.employ_name+" salary is greater than "+emp3.employ_name);
		else
			System.out.println(emp3.employ_name+" salary is greater than "+emp.employ_name);
		
	}

}
