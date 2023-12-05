package com.treemapassignments;

import java.util.Scanner;
import java.util.TreeSet;

public class TaskTrackerTreeSet {
	

	public static void main(String[] args) {
		
		System.out.println("Select the options from Main Menu:");
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Add a Name");
		System.out.println("2.Remove a Name");
		System.out.println("3.Check if Name Exists");
		System.out.println("4.Display All Names");
		
		TreeSet<TaskTracker> treeset= new TreeSet<>();
		
		TaskTracker obj=new TaskTracker(treeset);
		
		int option=sc.nextInt();
		
		Switch(option)
		{
			case 1:
				break;
			case 2:
				break;
				
		}

	}

}
