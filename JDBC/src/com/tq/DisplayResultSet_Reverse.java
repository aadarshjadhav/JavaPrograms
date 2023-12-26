package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

// 7.Retrive all records from Patient table in Result Set and display them in
// reverse and forward order.


public class DisplayResultSet_Reverse {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
		
		return con;
	}

	public static void main(String[] args) 
	{
		
		try
		{
			Connection con= getMySQLConnection();
			
			System.out.println("____Printing records in forward direction____");
			
			String sql="Select * from patients";
			PreparedStatement pstm=con.prepareCall(sql);
			
			ResultSet rs=pstm.executeQuery();
			while(rs.next())
			{
				System.out.println("Patient_id:"+rs.getInt(1));
				System.out.println("Patient_name:"+rs.getString(2));
				System.out.println("Patient_age:"+rs.getInt(3));
				System.out.println("Patient_weight:"+rs.getInt(4));
				System.out.println("Patient_Email:"+ rs.getString(5));
				System.out.println("Patient_Adimission_Date:"+rs.getDate(6));
				System.out.println("_____________________________");
				
			}
			System.out.println("______Reverse ORDER________");
			
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println("Patient_id:"+rs.getInt(1));
				System.out.println("Patient_name:"+rs.getString(2));
				System.out.println("Patient_age:"+rs.getInt(3));
				System.out.println("Patient_weight:"+rs.getInt(4));
				System.out.println("Patient_Email:"+ rs.getString(5));
				System.out.println("Patient_Adimission_Date:"+rs.getDate(6));
				System.out.println("_____________________________");
			}
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

	}

}
