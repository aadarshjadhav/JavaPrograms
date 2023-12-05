package com.testprograms5;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListReverse {
	
	public static void main(String args[])
	{
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Sudharshan");
		list.add("Ishwar");
		list.add("Suraj");
		list.add("Rohit");
		list.add("Aadarsh");
		
		System.out.println("Before Sort:"+list);
		
		Collections.sort(list);
		System.out.println("List in reverse sort"+list);
		
		
	}

}
