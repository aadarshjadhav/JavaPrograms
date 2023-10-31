package containmentassignments;

public class Employee {
	
	int id, salary;
	String name;
	
	
	MyDate doj;
	
	//Default Constructor;
	public Employee()
	{
		id=0;
		salary=0;
		name=" ";
	
		doj= new MyDate();
	}
	
	//Parameterized Constructor
	public Employee(int id, int salary, String name, MyDate doj)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		
		this.doj=doj;
	}
	
	public String toString()
	{
		return " Employee id:" + id+ " Employee name:"+ name+" Salary:"+salary + doj;
	}
	
	//Getters and Setters
	public int getEmployeeId()
	{
		return id;
	}
	
	public String getEmployeeName()
	{
		return name;
	}
	
	public int getEmployeeSalary()
	{
		return salary;
	}
	
	public MyDate getMyDate()
	{
		return doj;
	}
	
	public void setEmployeeId(int id)
	{
		this.id=id;
	}
	
	public void setEmployeeName(String name)
	{
		this.name=name;
	}
	
	public void setEmployeeSalary(int salary)
	{
		this.salary=salary;
	}
	
	public void setMyDate(MyDate doj)
	{
		this.doj=doj;
	}
	
	
}
