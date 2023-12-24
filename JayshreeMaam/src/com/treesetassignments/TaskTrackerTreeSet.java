package com.treesetassignments;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TaskTrackerTreeSet {
	

	public static void main(String[] args) {
		
		
		
		String task=null;
		TaskTracker task_obj=null;
		TreeSet<TaskTracker> treeset= new TreeSet<>();
		
		char ch='y';
		while(ch=='y')
		{
			System.out.println("Select the options from Main Menu:");
			Scanner sc= new Scanner(System.in);
			System.out.println("1.Add a Task");
			System.out.println("2.Remove a Task");
			System.out.println("3.Check if Task Exists");
			System.out.println("4.Display All Task");
			
			
			int option=sc.nextInt();
			
			switch(option)
			{
				
				case 1:	System.out.println("Enter the task to add:");
						task=sc.next();
						task_obj= new TaskTracker(task);
						treeset.add(task_obj);
						break;
						
				case 2: System.out.println("Enter the task to remove:");
						task=sc.next();
						task_obj= new TaskTracker(task);
						treeset.remove(task_obj);
						break;
				
				case 3:	System.out.println("Enter the task to check if it exists:");
						task=sc.next();
						task_obj= new TaskTracker(task);
						System.out.println("Status:"+treeset.contains(task_obj));
						break;
				
				case 4: System.out.println("Displaying all tasks:");
						Iterator<TaskTracker>itr_treeset= treeset.iterator();
						while(itr_treeset.hasNext())
						{
							TaskTracker task_tracker_obj=itr_treeset.next();
							
							System.out.println(task_tracker_obj);
						}
						break;
				
				default:System.out.println("Wrong option!!!!");
			
			}

			System.out.println("Do you want to go again? y?n?:");
			ch=sc.next().charAt(0);
			
		}
		
		

	}

}
