package containmentassignments;

public class Person {

	String name;
	String gender;
	int age;
	Address address = new Address();
	
	public Person(String n, String g, int ag, Address ads)
	{
		name=n;
		gender=g;
		age=ag;
		address= ads;
	}

	public static void main(String args[])
	{
		Address ad=new Address();
		ad.setCity("Pune");
		ad.setState("Maharastra");
		ad.setCountry("India");
		
		Person p= new Person("Jay", "male",25,ad);
		
		System.out.println("Persona Name:" +p.name+" Gender:"+p.gender+" Age:"+p.age+" City:" +ad.getCity() +" State:"+ad.getState()+" Country:"+ad.getCountry());
	}
	
}
