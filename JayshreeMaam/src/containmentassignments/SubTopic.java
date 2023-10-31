package containmentassignments;

public class SubTopic {
	int id;
	String name;
	Question q;
	
	public SubTopic()
	{
		id=0;
		name="null";
		
	}
	public SubTopic(int id, String name, Question q)
	{
		this.id=id;
		this.name=name;
		this.q=q;
	}
	
	public String toString()
	{
		return " SubTopic id:"+ id+ " SubTopic Name:"+name+ q;
	}

}
