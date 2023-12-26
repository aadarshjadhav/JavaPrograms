package com.jdbchashmapasignmentspart2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

//Fetch Patient names admitted after 5th May 2020 and age above 50 and store it in ArrayList.

public class Doctors_Patients_ArrayList {
	
	Connection con;
	ResultSet rs_doctors, rs_patients;
	Statement st_doctors, st_patients;
	Date d = Date.valueOf("2023-05-05");
	ArrayList<String> patient_array_list= new ArrayList<>();

	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}
	
	public Doctors_Patients_ArrayList() throws SQLException, ClassNotFoundException
	{
		con = getMySQLConnection();
		st_patients=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs_patients=st_patients.executeQuery("select pname,age,admissiondate from patients");
		
		
		
	}
	
	public void createArrayListPatients() throws SQLException
	{
		String patient_name=null;
		int age=0;
		Date admissiondate;
				
		while(rs_patients.next())
		{
			patient_name=rs_patients.getString(1);
			age=rs_patients.getInt(2);
			admissiondate=rs_patients.getDate(3);
			
			if(admissiondate.after(d))
			{
				patient_array_list.add(patient_name);
			}
		}
		
	}
	
	public void show()
	{
		Iterator itr_patient_array_list=patient_array_list.iterator();
		while(itr_patient_array_list.hasNext())
		{
			String s=(String) itr_patient_array_list.next(); //Doubt: Why do we need to convert to string?
			System.out.println("Names:"+s);
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Doctors_Patients_ArrayList obj= new Doctors_Patients_ArrayList();
		obj.createArrayListPatients();
		obj.show();
	}

}
