package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

//5. Delete all records from patient table for given patient id. Use PreparedStatement for the same.

public class Delete_All_Records_Hospital {
	
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
			System.out.println("Enter the patient id whose records you want to delete:");
			Scanner sc= new Scanner(System.in);
			
			int pid=sc.nextInt();
			
			String sql="delete from patients where pid = ?";
			PreparedStatement pstm= con.prepareCall(sql);
			pstm.setInt(1, pid);
			int i= pstm.executeUpdate();
			System.out.println("Check the table if the record has been deleted for not:"+i);
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
