package com.arraydemos;

import java.util.Scanner;

public class MarksPercentage {
	
	public static int[] createArraymarks()
	{
		int num[];
		
		System.out.println(" Enter the number of subjects:");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		num = new int[size];
		
		System.out.println(" Enter the Marks of each subject:");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		return num;
	}
	
	public static double percentage(int array[])
	{
		double percent=0;
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println(" Sum:"+sum);
		
		percent=(sum*100)/(100*array.length);
		
		System.out.println(" Percetage:"+percent);
		
		return percent;
	}
	
	public static void findGrade(double percent)
	{
		if(percent<=100 && percent>=90)
		{
			System.out.println(" Grade:A");
		}
		else if(percent <=89 && percent>=80)
		{
			System.out.println(" Grade:B");
		}
		else if(percent<=79 && percent>=70)
		{
			System.out.println(" Grade:C");
		}
		else if(percent<=69 && percent>=60)
		{
			System.out.println(" Grade:D");
		}
		else
		{
			System.out.println(" Grade:E");
		}
		
	}
	
	public static void main(String args[])
	{
		int arr[]= createArraymarks();
		double percent=percentage(arr);
		System.out.println(" Percentage:"+percent);
		findGrade(percent);
	}

}
