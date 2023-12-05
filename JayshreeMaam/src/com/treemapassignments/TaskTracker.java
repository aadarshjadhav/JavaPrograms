package com.treemapassignments;

import java.util.Scanner;
import java.util.TreeSet;

public class TaskTracker implements Comparable<TaskTracker>{
	
	String task;

	public TaskTracker(String task) {
		super();
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "TaskTracker [task=" + task + "]";
	}

	@Override
	public int compareTo(TaskTracker o) {
		
		return 0;
	}

	

}
