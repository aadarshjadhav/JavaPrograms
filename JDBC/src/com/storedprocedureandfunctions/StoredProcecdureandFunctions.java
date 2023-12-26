package com.storedprocedureandfunctions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcecdureandFunctions {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		
		return con;
		
	}

	public static void main(String[] args) {
		
		Connection con;
		
		try
		{
			con=getMySQLConnection();
			
			//calling procedure
			CallableStatement cs= con.prepareCall("{call GetCustomerLevel (?,?)}");
			
			cs.setInt(1, 201);
			cs.registerOutParameter(2, Types.VARCHAR);
			
			System.out.println(cs.execute());
			
			System.out.println("Customer Level is"+cs.getString(2));
			
			//calling function getNum
			
			cs=con.prepareCall("{?=call getNum(?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			
			cs.setInt(2, 1102);
			
			cs.execute();
			System.out.println(cs.getInt(1));
			
		
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
