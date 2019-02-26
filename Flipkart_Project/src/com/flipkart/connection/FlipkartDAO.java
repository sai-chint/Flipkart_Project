package com.flipkart.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlipkartDAO {

	public int insert(SignUp flipkart) throws SQLException {
		String query="insert into flipkart values(?,?,?,?,?,?)";
		Connection con = DBConnection.getConnection();
		PreparedStatement pStatement= con.prepareStatement(query);
		pStatement.setString(1, flipkart.getFisrtName());
		pStatement.setString(2, flipkart.getLastName());
		pStatement.setString(3, flipkart.getUserName());
		pStatement.setString(4, flipkart.getEmail());
		pStatement.setDouble(5, flipkart.getMobileNumber());
		pStatement.setString(6, flipkart.getGender());
		
		int output=pStatement.executeUpdate();
		
		return output;
	
}
}