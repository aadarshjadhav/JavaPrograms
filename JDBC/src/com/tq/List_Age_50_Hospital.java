package com.tq;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//1.List All Patient details with age above 50

public class List_Age_50_Hospital {
	
	public static Connection getMSQLConnection() throws ClassNotFoundException, SQLException
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
			Connection con= getMSQLConnection();
			String sql="select * from patients where age > ?";
			
			PreparedStatement psmt= con.prepareCall(sql);
			psmt.setDouble(1, 50);
			ResultSet rs= psmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Pid:"+rs.getInt(1));
				System.out.println("Pname:"+rs.getString(2));
				System.out.println("Page:"+rs.getInt(3));
				System.out.println("Pweight:"+rs.getInt(4));
				System.out.println("_________________________");
				
			}
			
			
		} 
		catch (ClassNotFoundException |SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}
