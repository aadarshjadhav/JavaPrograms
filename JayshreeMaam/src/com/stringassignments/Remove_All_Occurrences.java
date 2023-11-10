package com.stringassignments;

import java.util.Arrays;

//18.Write a Java program to remove all occurrences of a character from string.

public class Remove_All_Occurrences {
	
	public static void main(String args[])
	{
		String str= "Therea is a butterfly";
		String s1[]=str.split(" ");	
		
		char ch1='e';
		
		
		for(int i=0;i<s1.length;i++)
		{
			int space_count=0;
			char ch[]=s1[i].toCharArray();
		//	System.out.println(s1[i].length());
			for(int j=0;j<s1[i].length();j++)
			{
				if(ch[j]=='e')
				{
					space_count++;
					ch[j]=' ';
				
//					Code for shifting spaces to end of array
			
				}
			}
		//	System.out.println("space_count:"+space_count);
//			char temp[]= new char[s1[i].length()];
//			int count=1;
//			for(int k=0;k<s1[i].length();k++)
//			{	
//				
//				if(ch[k]!=' ')
//				{
//					temp[k]= ch[k];
//					//System.out.println(temp[k]);
//					//System.out.println("Temp at index:"+ k+" is:" +temp[k]);
//				}
//				else
//				{
//					if(count<=space_count && ch[k]==' ')
//					{
//						int index_temp=s1[i].length()-count;
//						temp[index_temp]=ch[k];
//					//	System.out.println("Sum index:"+(index_temp));
//						count++;
//					//	System.out.println("Temp at index:"+ k+" is:" +temp[k]);
//					}
//					
//				}
//				String temp1= new String(temp);
//				System.out.println("Temp1:"+temp1);
//			}
//			
//			ch=temp;
//			System.out.println("S1:"+s1[i]);
			System.out.println(Arrays.toString(ch));
		}
		
	}

}
