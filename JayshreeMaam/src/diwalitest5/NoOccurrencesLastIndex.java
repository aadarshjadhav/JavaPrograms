package diwalitest5;

import java.util.Scanner;

public class NoOccurrencesLastIndex {
	
	public static int countOccurrences(String str, char ch)
	{
		int count=0;
		
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
				if(ch==array[i])
				{
					count++;
				}
		}
		
		return count;
	}
	
	public static int findLastIndex(String str, char ch)
	{
		int lastindex=0;
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			if(ch==array[i])
			{
				lastindex=i;
			}
		}
		return lastindex;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the String:");
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		System.out.println("Enter the character you want to count:");
		
		char ch=sc.next().charAt(0);
		
		int count=countOccurrences(str,ch);
		int lastindex= findLastIndex(str,ch);
		
		System.out.println("Number of occurences:"+count);
		System.out.println("Last index occurences:"+lastindex);
		
	}

}
