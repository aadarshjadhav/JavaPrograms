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


public class Doctors_Keys_Patients_Value_HashMap_ArrayList_Patient_Object {
		
		Connection con;
		
		Statement st_patients, st_doctors;
		ResultSet rs_patients,rs_doctors;
		
		HashMap<Integer,ArrayList<Patients>> hashmap= new HashMap<>();
		
		
		public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
		{
			Connection con=null;
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb2","root","root");
			
			return con;
		}

		public Doctors_Keys_Patients_Value_HashMap_ArrayList_Patient_Object() throws ClassNotFoundException, SQLException
		{
			con=getMySQLConnection();
			
			st_patients=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs_patients=st_patients.executeQuery("select p.doc_id, pid,pname from patients p inner join doctors d on p.doc_id=d.doc_id");
			
			st_doctors=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs_doctors=st_doctors.executeQuery("select doc_id from doctors");
			
		}
		
		public void createHashMap() throws SQLException
		{
			System.out.println("_______________Inside CreatHashMap_________");
			
			int d_id;
			int p_d_id;
			int p_p_id;
			String p_name;
			Patients patient_obj=null;
			
			while(rs_doctors.next())
			{
				d_id=rs_doctors.getInt(1);
				rs_patients.beforeFirst();
				ArrayList<Patients> patient_list= new ArrayList<>();
				while(rs_patients.next())
				{
					p_d_id=rs_patients.getInt(1);
					p_p_id=rs_patients.getInt(2);
					p_name=rs_patients.getString(3);
					
					
					if(d_id==p_d_id)
					{
						patient_obj=new Patients(p_p_id,p_name);
						patient_list.add(patient_obj);
					}
				}
				
				hashmap.put(d_id, patient_list);
			}
		}
		
		
		public void showHashMap()
		{
			System.out.println("___________________Inside showMap______________________");
			
			Set<Entry<Integer, ArrayList<Patients>>> entry_hashmap=hashmap.entrySet();
			Iterator<Entry<Integer, ArrayList<Patients>>> itr_entries=entry_hashmap.iterator();
			
			while(itr_entries.hasNext())
			{
				Entry<Integer, ArrayList<Patients>> element_itr=itr_entries.next();
				System.out.println("Doctor_id:"+element_itr.getKey()+" --"+"Patients names:"+element_itr.getValue().toString());
				System.out.println("___________________________________");

			}
		}
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Doctors_Keys_Patients_Value_HashMap_ArrayList_Patient_Object obj= new Doctors_Keys_Patients_Value_HashMap_ArrayList_Patient_Object();
			System.out.println("Creating hashmap");
			obj.createHashMap();
			System.out.println("Showing hashmap");
			
			obj.showHashMap();
			
		}


}
