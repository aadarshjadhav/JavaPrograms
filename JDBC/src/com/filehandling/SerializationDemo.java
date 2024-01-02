
package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Serialiization Process
		Student s1 = new Student(100,"Aadarsh",75f);
		
		File file_n2 = new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JDBC\\src\\com\\filehandling\\student.txt");
		
		
		FileOutputStream fos=new FileOutputStream(file_n2);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println(s1);
		System.out.println("Object Saved");
		
		
		//Deserialization Process
		
		FileInputStream fis = new FileInputStream(file_n2);
		ObjectInputStream ois=new ObjectInputStream(fis);
		s1 = (Student) ois.readObject();
		
		System.out.println("Object Shown");
		System.out.println(s1);
		ois.close();
		fis.close();
		
		
		//Copy data from one file to another while
		File file_n3 = new File("D:\\ThinkQuotient\\eclipse-workspace\\gitworkspace\\JDBC\\src\\com\\filehandling\\student2.txt");
		
		FileOutputStream fos2= new FileOutputStream(file_n3);
		ObjectOutputStream oos2= new ObjectOutputStream(fos2);
		oos2.writeObject(s1);
		oos2.flush();
		oos2.close();
		fos2.close();
		System.out.println("Student file 2 has been created");
		
		
		
		
		
		
	}

}
