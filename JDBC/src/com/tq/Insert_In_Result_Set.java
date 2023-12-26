package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

//9. Insert new record in ResultSet so that it would be added in database table also.

public class Insert_In_Result_Set {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
		return con;
	}

	public static void main(String[] args) 
	{
		try
		{
			Connection con=getMySQLConnection();
			String sql="select* from patients";
			
			PreparedStatement pstm=con.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=pstm.executeQuery();
			
			rs.moveToInsertRow();
			rs.updateInt(1, 12);
			rs.updateString(2,"Jadoo");
			rs.updateInt(3, 29);
			rs.updateInt(4,80);
			rs.updateString(5, "jadoo@gmail");
			rs.updateDate(6, java.sql.Date.valueOf("2023-11-29"));
			
			rs.insertRow();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

	}

}
