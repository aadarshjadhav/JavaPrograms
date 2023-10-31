package containtmentdemo;

public class Employee {
	
	private int eid;
	private String name;
	private MyDateStaticVariable doj;
	
	public Employee() 
	{
		eid=0;
		name="";
		doj= new MyDateStaticVariable();
	}
	
	public Employee(int eid, String name, MyDateStaticVariable d)
	{
		this.eid=eid;
		this.name=name;
		this.doj=d;
	}
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setDoj(MyDateStaticVariable o)
	{
		this.doj=o;
	}
	
	public int getEid()
	{
		return eid;
	}

	public String getName()
	{
		return name;
	}
	
	public MyDateStaticVariable getDoj() 
	{
		return doj;
	}
	
	public String toString()
	{
		return "Eid:"+eid+" Ename:"+name+" Date of joining:"+doj;
	}
	
	public static void main(String args[])
	{
		Employee obj=new Employee();
		System.out.println(obj);
		
		MyDateStaticVariable d= new MyDateStaticVariable(12,2,2023);
		Employee obj1= new Employee(1001, "Rohit",d);
		System.out.println(obj1);
		
		Employee obj2= new Employee();
		obj2.setDoj(new MyDateStaticVariable(20,10,2023));
		obj2.setEid(1002);
		obj2.setName("Jayraj");
		System.out.println(obj2);
		
		int id=obj.getEid();
		String name=obj.getName();
		MyDateStaticVariable doj=obj.getDoj();
		System.out.println(id);
		System.out.println(name);
		System.out.println(doj);
	}
}
