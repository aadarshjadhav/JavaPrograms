package containmentassignments;

public class Branch {
	
	int id;
	String name;
	Subject s;
	
	//Defalt Constructor
	public Branch()
	{
		id=0;
		name="null";
	}
	
	//Parameterized Constructor
	public Branch(int id, String name, Subject s)
	{
		this.id=id;
		this.name=name;
		this.s=s;
	}
	
	public String toString()
	{
		return " Branch id:"+ id+ " Branch Name:"+name+ s;
	}
	


}
