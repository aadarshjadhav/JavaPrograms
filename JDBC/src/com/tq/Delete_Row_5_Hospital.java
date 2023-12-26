package com.tq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// 8.Delete record no 5 from resultset.
import java.sql.*;

public class Delete_Row_5_Hospital {
	
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
			
			String sql="select pid from patients";
			
			PreparedStatement pstm= con.prepareCall(sql);
			ResultSet rs=pstm.executeQuery();
			
			 	
			for(int i=0;i<=4;i++)
			{
				rs.next(); //CUSOR now has moved to fifth row of the Result set
			}
			
			int fifth_record=rs.getInt("pid");
			System.out.println("Fifth record:"+fifth_record);
			
			String sql2="delete from patients where pid = ?";
			pstm.clearParameters();
			
			pstm= con.prepareCall(sql2);
			pstm.setInt(1, fifth_record);
			int i=pstm.executeUpdate();
			System.out.println("Check whether the fifth record has been deleted:"+i);
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

	}

}
