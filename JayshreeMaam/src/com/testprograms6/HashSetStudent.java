package com.testprograms6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*Q8>There is a HashSet which has student objects. Create two ArrayLists from this HashSet. 
 * WAP to iterate and remove all the students in HashSet such that in one ArrayList 
 * called “placed” Students insert students who have been placed and in another ArrayList 
 * add un-“placed” Students. In the end, the HashSet should contain nothing. 
	Student class fields: (id, name, degree, passingYear, placed (true/false) ). 
*/

public class HashSetStudent {
	
	public static void main(String args[])
	{
		HashSet<Student> hashset= new HashSet<Student>();
		
		hashset.add(new Student(1,"Aadarsh","B.E",2021,false));
		hashset.add(new Student(2,"Rohit","B.E",2020,true));
		hashset.add(new Student(3,"Jayraj","B.E",2020,true));
		hashset.add(new Student(4,"Suraj","B.E",2019,false));
		
		ArrayList<Student> arraylist_placed=new ArrayList<>();
		ArrayList<Student> arraylist_not_placed=new ArrayList<>();
		
		Iterator<Student> itr_hashset=hashset.iterator();
		
		while(itr_hashset.hasNext())
		{
			Student std_obj=itr_hashset.next();
			
			if(std_obj.isPlaced())
				arraylist_placed.add(std_obj);
			else
				arraylist_not_placed.add(std_obj);
			
			itr_hashset.remove();
		}
		
		System.out.println("Students who are placed!");
		for(Student i:arraylist_placed)
			System.out.println(i);
		
		System.out.println("Students who are not placed!");
		for(Student j:arraylist_not_placed)
			System.out.println(j);
	}
	
	

}
