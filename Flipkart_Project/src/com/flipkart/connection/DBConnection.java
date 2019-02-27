package com.flipkart.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private static Connection con;
	
	public static Connection getConnection() {
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
	
		Statement st =con.createStatement();
		ResultSet rs= st.executeQuery("select * from flipkartProject");
		while(rs.next()) {
			System.out.println(rs);
		}
		con.close();
	}
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();	
	}
		return con;
	}
}	