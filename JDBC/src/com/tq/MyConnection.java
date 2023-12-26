package com.tq;

import java.sql.*;

public class MyConnection {

		public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
		{
			Connection con=null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb", "root","root");
			
			return con;
		}
}
