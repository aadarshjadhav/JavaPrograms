package com.testprograms5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveDuplicates {
	
	public static void main(String args[])
	{
			ArrayList<String> list= new ArrayList<String>();
			
			list.add("Monday");
			list.add("Tuesday");
			list.add("Monday");
			list.add("Thursday");
			list.add("Tuesday");
			list.add("Saturday");
			list.add("Sunday");
			list.add("Thursday");
			
			ArrayList<String> list2= new ArrayList<String>();
			Iterator<String> itr=list.iterator();
			while(itr.hasNext())
			{
				String str= itr.next();
				if(!list2.contains(str))
					list2.add(str);
				
			}
		
			System.out.println(list2);
	}

}
