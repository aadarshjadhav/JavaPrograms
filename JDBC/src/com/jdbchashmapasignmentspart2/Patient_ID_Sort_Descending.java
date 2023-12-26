package com.jdbchashmapasignmentspart2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Patient_ID_Sort_Descending {
	
	Connection con;
	
	Statement st_patients;
	ResultSet rs_patients;
	TreeSet<Integer> descendingTreeSet = new TreeSet<>(Comparator.reverseOrder());

	
	
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException
	{
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}
	
	public Patient_ID_Sort_Descending() throws ClassNotFoundException, SQLException
	{
		con= getMySQLConnection();
		
		st_patients=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs_patients=st_patients.executeQuery("select pid from patients");
		
		
	}
	
	public void createTreeSetPatient() throws SQLException 
	{
		Integer i;
		while(rs_patients.next())
		{
			
			i=rs_patients.getInt(1);
			descendingTreeSet.add(i);
		}
	}
	
	public void showTreeSet()
	{
		Iterator<Integer> itr_treeset=descendingTreeSet.iterator();
		System.out.println("Patient ID:");
		while(itr_treeset.hasNext())
		{
			System.out.println(itr_treeset.next());
		}
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Patient_ID_Sort_Descending obj= new Patient_ID_Sort_Descending();
		
		obj.createTreeSetPatient();
		obj.showTreeSet();

	}

}
