package com.jdbchashmapasignmentspart2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Call_Function_Count_Patient {
	
	Connection con;
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
        Connection con=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}

	public void callFunction() throws ClassNotFoundException, SQLException
	{
		con=getMySQLConnection();
		CallableStatement cs=con.prepareCall("{?=call getPatients(?)}");
		
		cs.registerOutParameter(1, Types.INTEGER);
		cs.setDate(2,java.sql.Date.valueOf("2023-01-01"));
		cs.execute();
		
		System.out.println("Number of patients admiteted:"+cs.getInt(1));
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Call_Function_Count_Patient obj= new Call_Function_Count_Patient();
		obj.callFunction();

	}

}
