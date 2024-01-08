
package com.jdbchashmapasignmentspart2;
// Create a HashMap with docid as key and list of patients treated by that
// doctor as value. Show all entries in HashMap.

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

public class Doctors_Keys_Patients_Value_HashMap {
	
	Connection con;
	
	Statement st_patients, st_doctors;
	ResultSet rs_patients,rs_doctors;
	
	HashMap<Integer,ArrayList<String>> hashmap= new HashMap<>();
	
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
		
		return con;
	}

	public Doctors_Keys_Patients_Value_HashMap() throws ClassNotFoundException, SQLException
	{
		con=getMySQLConnection();
		
		st_patients=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs_patients=st_patients.executeQuery("select p.doc_id, pname from patients p inner join doctors d on p.doc_id=d.doc_id");
		
		st_doctors=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs_doctors=st_doctors.executeQuery("select doc_id from doctors");
		
	}
	
	public void createHashMap() throws SQLException
	{
		int d_id;
		int p_d_id;
		String p_name;
		
		
		while(rs_doctors.next())
		{
			d_id=rs_doctors.getInt(1);
			rs_patients.beforeFirst();
			ArrayList<String> patient_list= new ArrayList<>();
			while(rs_patients.next())
			{
				p_d_id=rs_patients.getInt(1);
				p_name=rs_patients.getString(2);
				
				
				if(d_id==p_d_id)
				{
				
					patient_list.add(p_name);
				}
			}
			
			hashmap.put(d_id, patient_list);
			
		}
	}
	
	
	public void showHashMap()
	{
		Set<Entry<Integer, ArrayList<String>>> entry_hashmap=hashmap.entrySet();
		Iterator<Entry<Integer, ArrayList<String>>> itr_entries=entry_hashmap.iterator();
		
		while(itr_entries.hasNext())
		{
			Entry<Integer, ArrayList<String>> element_itr=itr_entries.next();
			System.out.println("Doctor_id:"+element_itr.getKey());
			System.out.println("Patients names:");
			ArrayList<String>list_elements=element_itr.getValue();
			Iterator<String>itr_list=list_elements.iterator();
			
			while(itr_list.hasNext())
			{
				String names=itr_list.next();
				System.out.println(names);
			}
			System.out.println("___________________________________");

		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Doctors_Keys_Patients_Value_HashMap obj= new Doctors_Keys_Patients_Value_HashMap();
		obj.createHashMap();
		obj.showHashMap();
		
		
		
	}

}
