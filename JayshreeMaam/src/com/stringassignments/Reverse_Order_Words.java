package com.stringassignments;
//Write a Java program to reverse order of words in a given string.

public class Reverse_Order_Words {
	
	public static void main(String args[])
	{
		String s="How are you";
		
		String s1[]=s.split(" ");
		String [] s2= new String[s1.length];
		
		int j=s1.length-1;
		for(int i=0;i<s1.length;i++)
		{
			s2[j]=s1[i];
			j--;
		}
		
		for(String x:s2)
			System.out.print(x+" ");
		
		//without split method
		String str="How are you";
		int count=0;
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				count=0;
				str1+=str.charAt(i);
			}
			if(str.charAt(i)!=' ')
			{
				count++;
				
			}
			if(count==1)
			{
				str1+=' ';
			}
			
		}
			System.out.println("\n"+str1);
		
		//Another logic reverse word in string
		String str4=" This is a Java Session";
		System.out.println(str);
		String [] str5=str4.split(" ");
		String output="";
		
		for(int m=0;m<str5.length;m++)
		{
			for(int k=str5[m].length()-1; k>=0;k--)
			{
				output+=str5[m].charAt(k);
			}
			output+=' ';
		}
		System.out.println(output);

	}
}

