package containmentassignments;

public class Institute {
	
	int id;
	String name;
	Branch b;
	
	//Default constructor
	public Institute() 
	{
		id=0;
		name="";
	}
	
	//Parameterized Constructor
	public Institute(int id, String name, Branch b) 
	{
		this.id=id;
		this.name=name;
		this.b=b;
	}
	
	public String toString()
	{
		return "Institue id:"+ id+" Institute Name:"+name+ b;
	}
	
	public static void main(String args[])
	{
		Branch b = new Branch(10001, "DP8", new Subject(1001,"Java",new Topic(101,"Containers", new SubTopic(11,"Objects", new 	Question(1,"What is Objects?")))));
		Institute ins=new Institute(400101, "ThinkQuotient", b);
		
		
		System.out.println(ins);
	}
}
