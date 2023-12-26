package com.jdbchashmapasignmentspart2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*
 * 7.Create a Stored Procedure which takes Doctor’s name as input
parameter and returns his specialty as output parameter. Call this stored
procedure in java Application
 * */

public class Call_Stored_Procedure_Doctors_Name {
	
	Connection con;
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
        Connection con=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}

	public void callStoredProcedure_Doctor_Name() throws ClassNotFoundException, SQLException
	{
		con=getMySQLConnection();
		
		CallableStatement cs=con.prepareCall("{call getDocSpeciality(?,?)}");
		
		System.out.println("Enter the Doctor's Name:");
		Scanner sc= new Scanner(System.in);
		
		String d_name= sc.next();
		
		cs.setString(1, d_name);
		
		cs.registerOutParameter(2, Types.VARCHAR);
		
		System.out.println(cs.execute());
		System.out.println("Speciality of:"+d_name+" is :"+ cs.getString(2));
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Call_Stored_Procedure_Doctors_Name obj= new Call_Stored_Procedure_Doctors_Name();
		obj.callStoredProcedure_Doctor_Name();

	}

}
