package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementDemo {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb", "root","root");
		
		return con;
	}
	
	public static void main(String args[])  
	{
		try 
		{
			Connection con=getMySQLConnection();
			String sql="Select employee_id,salary from employees where salary > ?";
		
			PreparedStatement psmt = con.prepareCall(sql);
			psmt.setDouble(1, 30000);
			ResultSet rs=psmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Employee id:"+rs.getInt(1));
				System.out.println("Salary:"+rs.getDouble(2));
				System.out.println("___________________________");
			}
			
			psmt.clearParameters();
			psmt.setDouble(1, 50000);
			
			System.out.println("______________");
			rs=psmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Employee id:"+rs.getInt(1));
				System.out.println("Salary:"+rs.getDouble(2));
				System.out.println("___________________________");
			
			}
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
