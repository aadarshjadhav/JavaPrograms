package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Insert_Hospital {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
		return con;
	}

	public static void main(String args[])
	{
		try 
		{
			Connection con=getMySQLConnection();
			String sql="insert into patients(pid,pname,age,weight) values(?,?,?,?)";
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Patient_id,name,age and weight:");
			int pid=sc.nextInt();
			String pname=sc.next();
			int age=sc.nextInt();
			int weight=sc.nextInt();
			
			PreparedStatement pstm= con.prepareCall(sql);
			pstm.setInt(1, pid);
			pstm.setString(2, pname);
			pstm.setInt(3, age);
			pstm.setInt(4, weight);
			
			int i=pstm.executeUpdate();
			System.out.println("Has the value inserted?:"+i);
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
