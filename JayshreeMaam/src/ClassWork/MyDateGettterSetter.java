package ClassWork;

public class MyDateGettterSetter {
	private int dd, mm, yy;
	//Setters
	public void setDate(int date)
	{
		dd=date;
		
	}
	public void setMonth(int month)
	{
		mm=month;
	}
	public void setYear(int year)
	{
		yy=year;
	}
	//Getters
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	
	public void printDate()
	{
		System.out.println("Date:"+ dd+ "/"+ mm+ "/"+yy);
	}

	public static void main(String args[])
	{
		//Object creation
		MyDateGettterSetter obj=new  MyDateGettterSetter();
		obj.setDate(17);
		obj.setMonth(10);
		obj.setYear(2023);
		obj.printDate();
		System.out.println("Now getting the date using getters");
		
		int main_day=obj.getDd();
		int main_month=obj.getMm();
		int main_year=obj.getYy();
		
		System.out.println("Day using getters:" + main_day);
		System.out.println("Month using getters:"+main_month);
		System.out.println("Year using getters:"+main_year);
	}
}
