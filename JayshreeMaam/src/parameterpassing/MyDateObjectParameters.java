package parameterpassing;

public class MyDateObjectParameters {
		
		private int dd,mm,yy;
		
		public MyDateObjectParameters(int d, int m, int y)
		{
			dd=d;
			mm=m;
			yy=y;
		}
		public static void swap(MyDateObjectParameters d1, MyDateObjectParameters d2)
		{
			MyDateObjectParameters temp=d1;
			d1=d2;
			d2=temp;
			System.out.println("Inside swap function");
			d1.printDate();
			d2.printDate();
		}
		
		public void printDate()
		{
			System.out.println("Date:" +dd+" Month:"+mm+" Year:"+ yy);
			
		}

		public static void main(String args[])
		{
			MyDateObjectParameters obj1= new MyDateObjectParameters(18,10,2023);
			MyDateObjectParameters obj2= new MyDateObjectParameters(19,10,2023);
			
			System.out.println("Objects Before swaping methhod is called!!");
			obj1.printDate();
			obj2.printDate();
			
			swap(obj1,obj2);
			System.out.println("Objects after swaping methhod is called!!");
			
			obj1.printDate();
			obj2.printDate();
		}
}
