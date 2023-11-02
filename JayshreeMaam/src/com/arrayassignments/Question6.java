package com.arrayassignments;
/*6.	Write two methods that return the average of an array with following headers.
a.	public static int average(int[] array)
b.	public static double average(double[] array).
c.	Write main and invoke the 2 methods.
*/
import java.util.Scanner;

public class Question6 {
	
	public static int[] arrayCreation()
	{
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		System.out.println("Enter theh elements:");
		int array[]=new int[size];
		for(int i=0; i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		return array;
	}
	
	public static double[] doublearrayCreation()
	{
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		
		System.out.println("Enter theh elements:");
		double array[]=new double[size]; //Doubt:Showing error
		for(int i=0; i<array.length;i++)
		{
			array[i]=sc.nextDouble();
		}
		
		return array;
	}
	
	public static int average(int[] array) 
	{
		int avg=0, sum=0;
		System.out.println("Avg of array through int method:");
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		avg=sum/array.length;
		
		return avg;
	}
	
	public static double average(double[] array) 
	{
		double avg=0, sum=0;
		System.out.println("Avg of array through Double method:");
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		avg=sum/array.length;
		
		return avg;
	}
	
	public static void main(String args[])
	{
		int array[]= arrayCreation();
		System.out.println(average(array));
		
		double array2[]=arrayCreation();
		
	}

}
