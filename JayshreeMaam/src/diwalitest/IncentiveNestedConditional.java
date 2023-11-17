package diwalitest;

import java.util.Scanner;

public class IncentiveNestedConditional {
	
	public static void main(String agrs[])
	{
//		double sale = 22000;
//		   double incentive = 
//			    	(sale >= 50000) ? sale*0.10 :
//			        (sale >= 30000 )? sale*0.08 :
//			        (sale >= 10000) ? sale*0.05 : 0;
//		  System.out.println("Incentive earned is : "+ incentive);
//		  
//		int cnt=1;
//		while(cnt<1)
//		{
//			System.out.println(cnt);
//			cnt++;
//		}
//		
//		for(int j=1;j<=3;j++)
//		{
//			for(int i=3;i>=1;i--)
//			{
//				System.out.print("Hello\t");
//			}
//			System.out.println();
//		}   
//	
//		int a= 2 , b = 8 , c = 6 ;
//		System.out.println(++a + a++ + b * ++c); 
//		System.out.println("a = " + a + " b= " + b + " c = " + c);
//		System.out.println(c*5/a + c++ + c );
//		System.out.println("a = " + a + " b= " + b + " c = " + c);

//		double radiusOfCircle = 8.0;
//		float areaOfCircle = 3.142*radiusOfCircle*radiusOfCircle;
//		System.out.println(" Area of Circle is "+areaOfCircle+"Sq.m." );

//		int x=3,y=5,z=4;
//		int k = z*y%x;
//		int j = y%z*x;
//		System.out.println(k);
//		System.out.println(j);
//		
//		char ch='m';
//		System.out.println((char)(++ch -32));
		
//		int i;
//		for(int i=5;i<=15;i++)
//		{
//			System.out.println(i++);
//		}


//		int count=0;
//		for(int i=300; i<=600;i++)
//		{
//			if(i%3==0 && i%5==0 && count<5)
//			{		
//				count++;
//				System.out.println(i);
//							
//			}
//		}
		
		System.out.println("Enter number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		switch(num)
		{
			case 1: System.out.println("You entered 1");
					break;
			case 2: System.out.println("You entered 2");
					break;
			default:System.out.println("\"You entered wrong number\""); //Doubt: how does this "" work?
		}


	}

}
