package ClassWork;

public class MyDate {
	// data member
	private int dd,mm,yy;
	
	//Constructor
	public MyDate()
	{
		System.out.println("Inside default constructor");
		dd=17;
		mm=10;
		yy=2023;
	}
	public MyDate(int d, int m, int y)
	{
		System.out.println("Inside parameterized constructor");
		dd=18;
		mm=12;
		yy=2023;
	}
	public void setData(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void printDate()
	{
		System.out.println("Date is " + dd+"/"+ mm+"/"+yy);
	}
	
	public void add(MyDate object1)
	{
		int d= this.dd+object1.dd;
		int m=this.mm+object1.mm;
		
		System.out.println("Addition of two date:" + "D:"+d+"M:"+m);
	}
	
	public static void main(String args[]) 
	{
		//TODO Auto-generated method stub
		//Object creation
		MyDate obj;
		obj = new MyDate();
		
		//
		MyDate obj1= new MyDate();
		obj1.setData(2, 12, 23);
		obj1.printDate();
		
		//Parameterized Constrcutor
		MyDate obj2= new MyDate(22,12,2023);
		
		obj1.add(obj2);
		
	}
	
}
