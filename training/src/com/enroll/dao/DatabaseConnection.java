package com.enroll.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	static Connection con;

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String path = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "pass1234";
		
		System.out.println("A");
		//oracle.jdbc.driver.OracleDriver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("B");
		con = DriverManager.getConnection(path, username, password);
		System.out.println("DatabaseConnection class => con  "+con);
		return con;
	
	}
}
