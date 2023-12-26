package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class INSERT_QUERY {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb","root","root");
		return con;
	}
	public static void main(String args[])
	{
		try 
		{
			
			Connection con=getMySQLConnection();
			String sql="insert into employees(employee_id, first_name, last_name, email) values(?,?,?,?)";
			
			System.out.println("Enter Employee_id, first_name, last_name, email:");
			Scanner sc= new Scanner(System.in);
			int emp_id=sc.nextInt();
			String emp_fname=sc.next();
			String emp_lname=sc.next();
			String emp_email=sc.next();
			
			PreparedStatement psmt=con.prepareCall(sql);
			psmt.setInt(1, emp_id);
			psmt.setString(2, emp_fname);
			psmt.setString(3, emp_lname);
			psmt.setString(4, emp_email);
			
			int i=psmt.executeUpdate();
			System.out.println("Value rerturned after insertion:"+i);
		} 
		catch(ClassNotFoundException |SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
