package com.resultsetdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class JDBC_HashMap_Dept_Employ_Demo {
	
	Connection con;
	
	ResultSet rsemp,rsdept;
	Statement stemp,stdept;
	
	PreparedStatement pst;
	HashMap<String, ArrayList<String>> map = new HashMap<>();
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb","root","root");
		
		return con;
	}
	
	
	public JDBC_HashMap_Dept_Employ_Demo() throws ClassNotFoundException, SQLException
	{
		con= getMySQLConnection();
		
		stemp = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		rsemp = stemp.executeQuery("select * from employees");
		
		stdept= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		rsdept= stdept.executeQuery("select * from departments");
		
	
	}
	
	public void createMap() throws SQLException
	{
		int deptno=0;
		String dname=null;
		
		while(rsdept.next())
		{
			deptno=rsdept.getInt(1);
			ArrayList<String> enames= new ArrayList<>();
			rsemp.beforeFirst();
			while(rsemp.next())
			{
				if(rsemp.getInt(11)==deptno)
				{
					dname=rsdept.getString(2);
					enames.add(rsemp.getString(2));
				}
			}
			map.put(dname, enames);
		}
	}
	
	public void show()
	{
		
		Set<Entry<String,ArrayList<String>>> set= map.entrySet();
		Iterator<Entry<String,ArrayList<String>>> itr=set.iterator();
		
		while(itr.hasNext())
		{
			Entry<String,ArrayList<String>> element=itr.next();
			
			if(element.getValue().size()>0)
			{
				System.out.println(element.getKey());
				System.out.println(element.getValue());
			}
		}
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		JDBC_HashMap_Dept_Employ_Demo obj= new JDBC_HashMap_Dept_Employ_Demo();
		obj.createMap();
		obj.show();
		

	}

}
