package com.flipkart.connection;

public class LoginPojo {
	
	String Email;
	String Password;
	
	public LoginPojo(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	

	public LoginPojo() {
		super();
	}


	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Login [Email=" + Email + ", Password=" + Password + "]";
	}
	
}
