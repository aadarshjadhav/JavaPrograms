package com.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Child {
	
	int a_child=100;
	
	public void childFunction()
	{
		System.out.println("Inside childFunctiton");
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		FileInputStream fin= null;
		FileOutputStream fout=null;
		BufferedInputStream bin=null;
		BufferedOutputStream bout=null;
		
		Parent p_obj= new Parent();
		
		System.out.println();
		
		File f = new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JDBC\\src\\com\\filehandling\\Inheritance.txt");
		
		fin = new FileInputStream(f);
		bin = new BufferedInputStream(fin);
		fout = new FileOutputStream("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JDBC\\src\\com\\filehandling\\Inheritance_new_file.txt");
		bout = new BufferedOutputStream(fout);
	}

}
