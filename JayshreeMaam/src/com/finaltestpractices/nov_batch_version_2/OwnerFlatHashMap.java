package com.finaltestpractices.nov_batch_version_2;

/*7.Using JDBC code fetch details from Owners table. 
 * Fetch details from Flats table. Create   HashMap<String, ArrayList<String>> 
 * where OwnerName is key and list of flat numbers he/she owns is value.   
 * Iterate hashmap to show owner names along with flat numbers they own.	
 * 
 * */

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class OwnerFlatHashMap {
	
	Connection con;
	Statement st_flatdetails, st_ownerdetails;
	ResultSet rs_flats, rs_owners;
	
	HashMap<String,ArrayList<Flats>> hashmap= new HashMap<>();
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/estatesdb","root","root");
		
		return con;
		
	}
	
	public void getResultSet() throws ClassNotFoundException, SQLException
	{
		con=getMySQLConnection();
		st_flatdetails=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs_flats=st_flatdetails.executeQuery("select flatno,oid from flats");
		
		st_ownerdetails=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs_owners=st_ownerdetails.executeQuery("select Oid,OwnerName from owners");
		
		
	}
	
	public void createHashMap() throws SQLException
	{
		System.out.println("_______________Inside CreatHashMap_________");
		
		int oid_owners;
		String names_owners;
		int oid_flats;
		String flatno;
		
		Flats obj_flats=null;
		
		while(rs_owners.next())
		{
			oid_owners=rs_owners.getInt(1);
			names_owners=rs_owners.getString(2);
			
			ArrayList<Flats> list_flat= new ArrayList<>();
			rs_flats.beforeFirst();
			while(rs_flats.next())
			{
				flatno=rs_flats.getString(1);
				oid_flats=rs_flats.getInt(2);
				
				if(oid_owners == oid_flats)
				{
					obj_flats = new Flats(flatno);
					list_flat.add(obj_flats);
				}
			}
			hashmap.put(names_owners, list_flat);
		}
	}
	
	public void showHashMap()
	{
		System.out.println("__________________Inside ShowMap___________________");
		
		Set<Entry<String, ArrayList<Flats>>> entries=hashmap.entrySet();
		Iterator<Entry<String, ArrayList<Flats>>> itr_entries=entries.iterator();
		while(itr_entries.hasNext())
		{
			Entry<String, ArrayList<Flats>> single_entry=itr_entries.next();
			String owner_name_key=single_entry.getKey();
			ArrayList<Flats> list_flatnos=single_entry.getValue();
			
			System.out.println("OwnerName:"+ owner_name_key+ "-- FlatList:"+list_flatnos.toString());
			System.out.println("___________________________________");
		}
	}
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		OwnerFlatHashMap obj = new OwnerFlatHashMap();
		obj.getResultSet();
		obj.createHashMap();
		obj.showHashMap();
	}

}
