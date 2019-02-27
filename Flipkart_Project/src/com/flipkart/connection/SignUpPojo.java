package com.flipkart.connection;

public class SignUpPojo {
	
	String FirstName;
	String LastName;
	String Email;
	String Password;
	double MobileNumber;
	String Gender;
	
	
	public SignUpPojo() {
		super();
	}

	public SignUpPojo(String firstName, String lastName, String email,String password, double mobileNumber, String gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		MobileNumber = mobileNumber;
		Gender = gender;
	}

	

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
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

	public double getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "SignUpPojo [FisrtName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", Password="
				+ Password + ", MobileNumber=" + MobileNumber + ", Gender=" + Gender + "]";
	}	
	
}
