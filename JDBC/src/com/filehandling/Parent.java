package com.filehandling;

import java.io.Serializable;

public class Parent implements Serializable{
	
	int a_parent=100;
	
	public void parentFunction()
	{
		System.out.println("Inside childFunctiton");
	}

	@Override
	public String toString() {
		return "Parent [a_parent=" + a_parent + "]";
	}
	
	

}
