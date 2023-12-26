package com.tq;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) {
		
		try
		{
			Connection con=MyConnection.getMySQLConnection();
			String sql="select * from departments";
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
//			while(rs.next())
//			{
//				System.out.println("Department id:"+rs.getInt(1));
//				System.out.println("Department Name:"+rs.getString(2));
//				System.out.println("Manager id:"+rs.getInt(3));
//				System.out.println("Location id:"+rs.getInt(4));
//				System.out.println("___________________________");
//			}
//			
			sql="insert into departments values(280,"+"'HR'"+","+206+","+1800+")";
			int cnt=st.executeUpdate(sql); // This execute statement returns true
			System.out.println(cnt+"inserted....");
			
			
			con.createStatement();
			System.out.println(con);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
