package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

//Update email address of patient whose name is ‘Sakshi’. Use Statement object to do the same

public class Update_Email_Hospital {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
		return con;
	}

	public static void main(String[] args) 
	{
		try 
		{
			Connection con=getMySQLConnection();
			
			
			System.out.println("Enter the Patient ID whose email ID you want to updaate:");
			Scanner sc= new Scanner(System.in);
			int pid=sc.nextInt();
			
			System.out.println("Enter the email ID you want to assign:");
			String update_email=sc.next();
			
			String sql="update patients set email= ? where pid = ?";
			
			PreparedStatement pstm=con.prepareCall(sql);
			pstm.setString(1,update_email);
			pstm.setInt(2,pid);
			int i= pstm.executeUpdate();
			System.out.println("Check if the table has been updated or not:"+i);
			
			
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
	}

}
