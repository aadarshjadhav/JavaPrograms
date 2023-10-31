package containmentassignments;

public class Subject {
	int id;
	String name;
	Topic t;
	
	public Subject()
	{
		id=0;
		name="null";
	}
	
	public Subject(int id, String name, Topic t)
	{
		this.id=id;
		this.name=name;
		this.t=t;
	}
	
	public String toString()
	{
		return " Subject id:"+ id+ " Subject Name:"+name+ t;
	}
	

}
