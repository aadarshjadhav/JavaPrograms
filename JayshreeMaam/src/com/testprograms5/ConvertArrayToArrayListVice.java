package com.testprograms5;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayListVice {
	
	public static void main(String args[])
	{
		System.out.println("From Array to Arraylist:");
		Integer []a= {23,45,56,32,27,34};
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
	    System.out.println(list);  
	    
	    System.out.println("From ArrayList to Array:");
	    int []array= new int [list.size()];
	   
	    for(int i=0;i<list.size();i++) 
	    {
	    	array[i]=list.get(i);
	    }
	    System.out.println(Arrays.toString(array));
	    
	    System.out.println("By In Build Function:");
	     Integer[] array2 = list.toArray(new Integer[0]);
	     
	     System.out.println(Arrays.toString(array2));
	}

}
