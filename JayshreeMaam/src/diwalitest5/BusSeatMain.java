package diwalitest5;

import java.util.Arrays;
import java.util.Scanner;

public class BusSeatMain {
	
	public static void main(String args[])
	{
		Bus b[]= new Bus[2];
		
		System.out.println("Enter the bus details:-");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<b.length;i++)
		{
			b[i]= new Bus();
			System.out.println("Enter the Bus id for bus no:"+ i+1);
			b[i].setBusId(sc.nextInt());
			
			System.out.println("Enter thhe number of seats of the bus:");
			int seatsize= sc.nextInt();
			Seat sarr[]= new Seat[seatsize];
			
			for(int j=0;j<seatsize;j++)
			{
				System.out.println("Enter the seat detaiils for seatno:"+ j+1);
				sarr[j]= new Seat();
				
				System.out.println("Enter the seat no:");
				sarr[j].setSeatno(sc.nextInt());
				
				System.out.println("Enter the seat Type:");
				sarr[j].setSeatType(sc.next());
				
				System.out.println("Enter the seat Price:");
				sarr[j].setSeatPrice(sc.nextInt());
				
			}
			
			b[i].setSeat(sarr);
			System.out.println(b[i]);
		}
	}

}
