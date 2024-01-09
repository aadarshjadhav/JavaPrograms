package com.jdbchashmapasignmentspart2;
/*
 * 6.Create Stored Procedure in database which takes pid as input parameter
and returns patient age and name as output parameters. Call this
procedure through java application
 * */ 


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Call_Stored_Procedure_Patient_ID {
	
	Connection con;
	
	ResultSet rs;
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}

	public void callStoredProcedurePatientID() throws SQLException, ClassNotFoundException
	{
		con=getMySQLConnection();
		CallableStatement cs=con.prepareCall("{call getPatientNameAge(?,?,?)}");
		
		System.out.println("Enter the patient's ID:");
		Scanner sc= new Scanner(System.in);
		
		int user_input=sc.nextInt();
		
		cs.setInt(1, user_input);
		
		
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.INTEGER);
		
		System.out.println(cs.execute());
		System.out.println("Customer name:"+cs.getString(2));
		System.out.println("Customer Age:"+cs.getInt(3));
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Call_Stored_Procedure_Patient_ID obj= new Call_Stored_Procedure_Patient_ID();
		obj.callStoredProcedurePatientID();
		

	}

}
