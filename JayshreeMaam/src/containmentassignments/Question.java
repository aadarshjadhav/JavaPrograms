package containmentassignments;

public class Question {
	int id;
	String name;
	
	public Question()
	{
		id=0;
		name="null";
	}
	
	public Question(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return " Question:"+ id + " Question Name:"+ name;
	}
	
	
}
