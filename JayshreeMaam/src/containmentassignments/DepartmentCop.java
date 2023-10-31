package containmentassignments;

public class DepartmentCop {
	
	int id;
	String name;
	Employee emp;
	
	public DepartmentCop()
	{
		id=0;
		name=" ";
		
		emp= new Employee();
	}
	
	public DepartmentCop(int id, String name, Employee emp)
	{
		this.id=id;
		this.name=name;
		
		this.emp=emp;
	}
	
	public String toString()
	{
		return " Department ID:"+ id+ " Department name:" + name+ emp;
	}
	
	public int getDepartmentId()
	{
		return id;
	}
	
	public String getDepartmentName()
	{
		return name;
	}
	
	public Employee getEmployee()
	{
		return emp;
	}
	
	public void setDepartmentId(int id)
	{
		this.id=id;
	}
	
	public void setDepartmentId(String name)
	{
		this.name=name;
	}
	
	public void setEmployee(Employee emp)
	{
		this.emp=emp;
	}
	
	public static void main(String args[])
	{
		MyDate doj= new MyDate(11,12,2023);

		Employee emp= new Employee(101, 20000, "Aadarsh", doj);
		
		
		DepartmentCop dcp= new DepartmentCop();
		dcp.setDepartmentId(10001);
		dcp.setDepartmentId("Development");
		dcp.setEmployee(emp);
		
		dcp.emp.doj.setMyDate(12, 12, 2023);
		
		dcp.emp.setEmployeeId(102);
		System.out.println(dcp);
		
		
	}
}
