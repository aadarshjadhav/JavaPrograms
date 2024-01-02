package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		
		File ff = new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JayshreeMaam\\src\\com\\treemapassignments\\Book.java");
	
		System.out.println("File Name:"+ff.getName());
		System.out.println("Path:"+ff.getPath());
		System.out.println("Abs path:"+ff.getAbsolutePath());
		System.out.println("Parent:"+ff.getParent());
		
		System.out.println(ff.exists()?"exists":"not exists");
		System.out.println(ff.canWrite()?"is writable":"it's not wrtiable");
		
		System.out.println(ff.canRead()?"readable":"its not readable");
		System.out.println(ff.isDirectory()?"is directory":"its not directory");
		System.out.println(ff.isAbsolute()?"is Absolute":"its not Aabsolute");
		System.out.println(ff.isFile()?"Is file":"Its not file");
		System.out.println("File last modified"+ff.lastModified());
		
		System.out.println("File size:"+ff.length());
		
		System.out.println("____________________Getting all the files from the folder_____________________________:");
		
		File folder= new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JayshreeMaam\\src\\com\\treemapassignments");
		
		if(folder.isDirectory())
		{
			String[] files = folder.list();
			
			for(String filenames: files)
			{
				System.out.println(filenames);
			}
		}
		
		//Creating a new file, but it is created only if there is not file with the same name.
		File file_n1 = new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JayshreeMaam\\src\\com\\treemapassignments\\File_Handling_Test.java");
		System.out.println("New file has been created:"+file_n1.createNewFile());
		
		//Deleting a file
		System.out.println("File has been deleted:"+file_n1.delete());
		
		File file_n2 = new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JayshreeMaam\\src\\com\\treemapassignments\\File_Handling");
		
		System.out.println("Creating a new folder:"+file_n2.mkdir());
		
		System.out.println("Deleting the folder:"+file_n2.delete());
		
		System.out.println("Check if the file or directory exists:"+folder.exists());
		
	}

}
