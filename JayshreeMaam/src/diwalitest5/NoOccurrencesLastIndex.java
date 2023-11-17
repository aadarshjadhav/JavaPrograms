package diwalitest5;

import java.util.Scanner;

public class NoOccurrencesLastIndex {
	
	public static int countOccurrences(String str)
	{
		int count=0;
		System.out.println("Enter the character you want to count:");
		Scanner sc= new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(ch==array[j])
				{
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the String:");
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		
		int count=countOccurrences(str);
		System.out.println("Number of occurences:"+count);
		
	}

}
