package com.arrayassignments;

import java.util.Arrays;

public class HomeWork2 {
	
	public static void combine2Array()
	{
		
		int n1[]= {1,2};
		int n2[]= {5,6,7,8,9};

		int n3[]= new int[n1.length+n2.length];
		
		for(int i=0;i<n1.length;i++)
		{
			for(int j=i;j<n2.length;)
			{
				n3[i+j]=n1[i];
				n3[i+j+1]=n2[i];
				break;
			}
		}
		
		if(n1.length<n2.length)
		{
			for(int j=n1.length;j<n2.length;j++)
			{
				n3[]=n2[j];
			}
		}
		System.out.println("Array:"+Arrays.toString(n3));
	}
	public static void main(String args[])
	{
		combine2Array();
	}
}
