package com.hashmapassignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

/*
 * WAP to create a ArrayList Student which contain rollno,name,arrayList marks,percentage ,grade.
	From Above arrayList of student , create a Map which having key as a grade and value is ArrayList<Student> 
* */


public class Student1HashArrayList {
	
	public static void main(String args[])
	{
		ArrayList<Integer> marks_array_list= new ArrayList<Integer>(Arrays.asList(78,56,90,45,88));
		Student1 student_obj= new Student1(1,"Aadarsh",marks_array_list);
		
		ArrayList<Integer> marks_array_list1= new ArrayList<Integer>(Arrays.asList(78,56,90,90,90));
		Student1 student_obj1= new Student1(2,"Sudharshan",marks_array_list1);
		
		ArrayList<Integer> marks_array_list2= new ArrayList<Integer>(Arrays.asList(60,60,56,57,90));
		Student1 student_obj2= new Student1(3,"Suraj",marks_array_list2);
		
		ArrayList<Integer> marks_array_list3= new ArrayList<Integer>(Arrays.asList(78,56,90,90,90));
		Student1 student_obj3= new Student1(4,"Maroti",marks_array_list3);
		
		ArrayList<Integer> marks_array_list4= new ArrayList<Integer>(Arrays.asList(45,56,45,55,60));
		Student1 student_obj4= new Student1(5,"Prashant",marks_array_list4);
		
		ArrayList<Student1> student_array_list= new ArrayList<>();
		
		student_array_list.add(student_obj);
		student_array_list.add(student_obj1);
		student_array_list.add(student_obj2);
		student_array_list.add(student_obj3);
		student_array_list.add(student_obj4);
		
		HashMap<String,ArrayList<Student1>> hash_map_student= new HashMap<>();
		
		Iterator<Student1> itr_stud_array_list=student_array_list.iterator();
		
		while(itr_stud_array_list.hasNext())
		{
			Student1 stud_obj=itr_stud_array_list.next();
			
			//Check if map contains key
			if(hash_map_student.containsKey(stud_obj.getGrade()))
			{
				//get value from the key
				ArrayList<Student1> stud1_array_list= hash_map_student.get(stud_obj.getGrade());
				
				//add new Student in arrayList
				stud1_array_list.add(stud_obj);
				//replace value of that key
				
				hash_map_student.put(stud_obj.getGrade(), stud1_array_list);
				
				
			}
			else //If the key, which is grade here, is not present
			{
				//Create new ArrayList and add object
				ArrayList<Student1> new_stud_array_list= new ArrayList<Student1>();
				new_stud_array_list.add(stud_obj);
				//put the key and value in the map
				hash_map_student.put(stud_obj.getGrade(), new_stud_array_list);
			}
		}
		
		Set<String> set=hash_map_student.keySet(); //Get Set of of entire Keys from the hashmap
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println("S:"+s);
			System.out.println(hash_map_student.get(s));
		}
		
		
	}

}
