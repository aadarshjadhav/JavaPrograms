package com.stringassignments;
//Check whether String is Palindrome

public class String_Palindrome {
	
	public static void main(String args[])
	{
		String str="reviver";
		char ch[]=str.toCharArray();
		char temp[]= new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			temp[str.length()-1-i]= ch[i];
		}
		
		boolean status=true;
		for(int i=0;i<str.length();i++)
		{
			if(temp[i]!=ch[i])
			{
				status=false;
			}
		}
		if(status)
		{
			System.out.println("The string "+ str+ " is palindrome");
		}
		
		//With 1 for loop
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++)
		{
			if(ch[str.length()-1-i]!=ch[i])
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("The string "+ str+ " is palindrome");
		}
		
	}

}
