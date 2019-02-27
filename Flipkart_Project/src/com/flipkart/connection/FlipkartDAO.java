package com.flipkart.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FlipkartDAO {
	
	public int signUp(SignUpPojo sup) throws SQLException
	{
		String query="insert into flipkartProject values(?,?,?,?,?,?)";
		Connection con=DBConnection.getConnection();
		PreparedStatement pStatement=con.prepareStatement(query);
		pStatement.setString(1,sup.getFirstName());
		pStatement.setString(2, sup.getLastName());
		pStatement.setString(3, sup.getEmail());
		pStatement.setString(4,sup.getPassword());
		pStatement.setDouble(5,sup.getMobileNumber());
		pStatement.setString(6,sup.getGender());
		
		int result=pStatement.executeUpdate();
		return result;
	}
	
	public boolean read(String email,String password) throws SQLException
	{
		String query="select Email,Password from flipkartProject";
		Connection con=DBConnection.getConnection();
		Statement statement=con.createStatement();
		ResultSet resultset=statement.executeQuery(query);
		while(resultset.next())
		{
			String email1=resultset.getString("Email");
			String pwd=resultset.getString("Password");
			if(email.equals(email1) && password.equals(pwd))
			{
				return true;
			}
		}
		return false;
		
	}
	
	public String fetchName(String email) throws SQLException {
		String query="select EMAIL from flipkartProject where EMAIL=?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pStatement= con.prepareStatement(query);
		String name=null;
		pStatement.setString(1, email);
		ResultSet rs=pStatement.executeQuery(query);
		  while(rs.next())
		  {
			  
			name=rs.getString(1);	 
			  
		  }
		return name;
		
	}
	
}
