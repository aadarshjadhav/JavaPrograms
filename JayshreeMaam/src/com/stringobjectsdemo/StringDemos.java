package com.stringobjectsdemo;

import java.util.Arrays;

public class StringDemos {
	public static void main(String args[])
	{
		String str="Java";
		String str1= new String("Java");
		
		//Hashcode for both str and str1 are same.
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		String str2= new String("Programming");
		
		char ch[]= {'a','b','c','d','e'};
		String s1= new String(ch);
		System.out.println(s1);
		
		System.out.println(str2.length());
		char ch1=str.charAt(4);
		System.out.println(ch1);
		String str3= str1.concat(str2);
		


	}

}
