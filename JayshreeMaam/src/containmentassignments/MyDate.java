package containmentassignments;

public class MyDate {
	int dd,mm,yy;

	
	public MyDate()
	{
		dd=0;
		mm=0;
		yy=0;
		
	}
	
	public MyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void setMyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String getMyDate()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public String toString()
	{
		return " Date:" + dd +"/"+mm+"/"+yy;
	}

}
