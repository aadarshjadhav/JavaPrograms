package containmentassignments;

public class Topic {
	
	int id;
	String name;
	SubTopic subt;
	
	public Topic()
	{
		id=0;
		name="null";
	}
	public Topic(int id, String name, SubTopic subt)
	{
		this.id=id;
		this.name=name;
		this.subt=subt;
	}
	
	public String toString()
	{
		return " Topic id:"+ id+ " Topic Name:"+name+ subt;
	}

}
