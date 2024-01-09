package com.finaltestpractices.nov_batch_version_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOwnerInfoWithoutSP
 {
	
	
	Connection con;
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/estatesdb","root","root");
		return con;
	}
	
	public void updateFlatno() throws SQLException, ClassNotFoundException
	{
		con= getMySQLConnection() ;
		
		String updatequerry= "Update Owners "
				+ "Set ownername=?,mobile=?,email=?"
				+"Where Oid in(select oid from Flats where flatno=?)";
		PreparedStatement ppst=con.prepareStatement(updatequerry);
		ppst.setString(1, "Ajay");
		ppst.setLong(2, 999999999);
		ppst.setString(3, "ajay@gmail.com");
		ppst.setString(4, "C114");
		
		ppst.executeUpdate();
		
		
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		UpdateOwnerInfoWithoutSP obj = new UpdateOwnerInfoWithoutSP();
		obj.updateFlatno();

	}

}
