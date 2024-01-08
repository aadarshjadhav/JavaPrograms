package com.finaltestpractices.nov_batch_version_2;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 1.Write a code to create updatable ResultSet to display OwnerID,OwnerName,
 * Mobile,email  with any random order and direction. 
 * Update email address of all owners in such a way that, 
 * if  it contains ‘gmail.com’ then it should be replaced with ‘yahoo.com’and vice versa.
 * 
 * */
public class EstatesDBOwnersEmail {

	Connection con;
	
	Statement st;
	ResultSet rs;
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con= null;
		Class.forName("com.mysql.jdbc.Driver");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/estatesdb","root","root");
		
		return con;
	}
	
	public EstatesDBOwnersEmail() throws ClassNotFoundException, SQLException
	{

		con=getMySQLConnection();
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select oid,Email from owners");
	
	}
	
	public void updateEmail() throws SQLException
	{
		rs.beforeFirst();
		
		while(rs.next())
		{
			String og_Email= rs.getString(2);
			String up_Email = og_Email.contains("gmail.com")? og_Email.replace("gmail.com","yahoo.com"):
							  og_Email.replace("yahoo.com", "gmail.com");
			
			rs.updateString(2, up_Email);
			rs.updateRow();
		
		}
		
	}
	
	public void displayResultSet() throws SQLException
	{
		rs.beforeFirst();
		while(rs.next())
		{
			String str=rs.getString(2);
			System.out.println(str);
			
		}
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		EstatesDBOwnersEmail obj = new EstatesDBOwnersEmail();
		obj.updateEmail();
		obj.displayResultSet();
		
		
	}

}
