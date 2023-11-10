package com.stringassignments;

import java.util.Arrays;

public class Replace_String_By_Another_String {
	
	public static void main(String args[])
	{
		String str="India is our country";
		
		String str_split[]= str.split(" ");
		
		String str2="Bharat";
		String str3="India";
		
		for(int i=0;i<str_split.length;i++)
		{
			if(str_split[i].equals(str3))
			{
				System.out.println("Inside if");
				str_split[i]=str2;
			}

			System.out.println(str_split[i]);
		}
		
		System.out.println(Arrays.toString(str_split));
	}

}
