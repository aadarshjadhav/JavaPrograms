package com.stringassignments;

import java.util.Arrays;

// Check whether String is Anagram.
public class Anagram {
	
	public static char[] sort(String str)
	{
		char ch[]=str.toCharArray();
		char temp;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
	}
	
	public static boolean compare(char ch[],char ch2[])
	{
		boolean status=true;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch2[i])
			{
				continue;
			}
			else
			{
				status=false;
				return status;
			}
		}
		
		return status;
	}
	
	public static void main(String agrs[])
	{
		String str="care";
		String str2="race";
		
		char ch[];
		char ch2[];
		
		ch=sort(str);
		ch2=sort(str2);
		
		if(compare(ch,ch2))
		{
			System.out.println("They are Anagram!");
		}
		
		System.out.println(Arrays.toString(ch));
		
	}

}
