package com.jdbchashmapasignmentspart2;
//Create HashMap with patient id as key and patient Name as value and display it.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Doctors_Patients_HashMap {
	
	Connection con;
	ResultSet rs_patients;
	Statement st_patients;
	HashMap<Integer,String> hashmap = new HashMap<>();
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con= null;
		Class.forName("com.mysql.jdbc.Driver");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}
	
	public Doctors_Patients_HashMap() throws ClassNotFoundException, SQLException
	{
		con=getMySQLConnection();
		st_patients=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs_patients=st_patients.executeQuery("select pid,pname from patients");
		
	}
	
	public void createPatientHashMap() throws SQLException
	{
		Integer p_id;
		String p_name;
		
		while(rs_patients.next())
		{
			p_id=rs_patients.getInt(1);
			p_name=rs_patients.getString(2);
			
			hashmap.put(p_id, p_name);
		}
		
	}
	
	public void showMap()
	{
		Set<Entry<Integer, String>> entries=hashmap.entrySet();
		Iterator<Entry<Integer, String>> its_entries=entries.iterator();
		
		while(its_entries.hasNext())
		{
			Entry<Integer, String> element=its_entries.next();
			System.out.println("Key:"+element.getKey());
			System.out.println("Key:"+element.getValue());
		}
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Doctors_Patients_HashMap obj=new Doctors_Patients_HashMap();
		obj.createPatientHashMap();
		obj.showMap();
		
	}

}
