package com.resultsetdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tq.MyConnection;

public class ResultSetScrollingDemo {

	Connection con;
	Statement st;
	ResultSet rs;
	String sql;
	
	public static Connection getMSQLConnection() throws SQLException, ClassNotFoundException
	{
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost/testcoursedb","root","root");
		
		return con;
	}
	
	public ResultSetScrollingDemo() throws SQLException, ClassNotFoundException 
	{
		con=getMSQLConnection();
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		sql="select employee_id,first_name,last_name, salary, department_id from employees limit 10";
		
		rs=st.executeQuery(sql);
		
	}
	
	public void showScrollingDataInForward() throws SQLException
	{
		System.out.println("________________________________");
		System.out.println("EMP ID"+ "\t"+"First_Name"+"Last_name"+"\t"+"salary"+"\tDept No");
		
		System.out.println("_______________________________");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+ "\t\t"+rs.getInt(5));
			
		}
		
	}
	
	public void showScrollingDataInReverse() throws SQLException
	{
		System.out.println("_____________________________");
		System.out.println("EMP ID"+ "\t"+"First_Name"+"Last_name"+"\t"+"salary"+"\tDept No");
		
		System.out.println("_____________________________");
		
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+ "\t\t"+rs.getInt(5));
			
			
		}
	}
	
	public void showAbsolutepos(int i) throws SQLException
	{
		rs.absolute(i);
		System.out.println("Recrd in"+ i +"Postion");
		System.out.println("_______________________");
		System.out.println("EMP ID"+ "\t"+"First_Name"+"Last_name"+"\t"+"salary"+"\tDept No");
		
		
		System.out.println("______________________________");
		
		System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+ "\t\t"+rs.getInt(5));
		
		System.out.println();
		
		
		rs.absolute(-5);
		
		System.out.println("Record in -5 position");
		System.out.println("________________________");
		
		System.out.println();
		System.out.println("EMP ID"+ "\t"+"First_Name"+"Last_name"+"\t"+"salary"+"\tDept No");
		System.out.println("__________________________________");
		System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+ "\t\t"+rs.getInt(5));
		
		
		rs.relative(2);
		System.out.println("Record in 2nd relative position");
		System.out.println("EMP ID"+ "\t"+"First_Name"+"Last_name"+"\t"+"salary"+"\tDept No");
		System.out.println("__________________________________");
		System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+ "\t\t"+rs.getInt(5));
		
		
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		ResultSetScrollingDemo obj= new ResultSetScrollingDemo();
		obj.showScrollingDataInForward();
		System.out.println();
		obj.showScrollingDataInReverse();
		obj.showAbsolutepos(4);
	}

}
