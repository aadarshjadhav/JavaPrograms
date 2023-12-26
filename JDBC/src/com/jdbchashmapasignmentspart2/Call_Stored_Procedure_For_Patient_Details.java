package com.jdbchashmapasignmentspart2;

/*
 * 8.Create Stored Procedure which takes doctor id as input parameter and
returns patient name, patient id and his age as result Set. Call This Stored
Procedure in Java Application
 * */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Call_Stored_Procedure_For_Patient_Details {

	Connection con;
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
        Connection con=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}
	
	public void getPatientDetails() throws ClassNotFoundException, SQLException
	{
		con=getMySQLConnection();
		
		CallableStatement cs= con.prepareCall("{call getPatientDetailsFromDoc_ID(?)}");
		
		Scanner sc= new Scanner(System.in);
		
		//Enter the doc_id to get his patients
		System.out.println("Enter the doctor id to get his patient details:");
		int doc_id= sc.nextInt();
		
		cs.setInt(1, doc_id);
		
		
		ResultSet rs=cs.executeQuery();
		System.out.println("Patient Details:");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getInt(3));
		
		}
		
	
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Call_Stored_Procedure_For_Patient_Details obj= new Call_Stored_Procedure_For_Patient_Details();
		obj.getPatientDetails();
	}

}
