package com.flipkart.connection;

public class SignUp {
	
	String FisrtName;
	String LastName;
	String UserName;
	String Email;
	double MobileNumber;
	String Gender;
	
	public SignUp() {
		super();
	}

	public SignUp(String fisrtName, String lastName, String userName, String email, double mobileNumber,
			String gender) {
		super();
		FisrtName = fisrtName;
		LastName = lastName;
		UserName = userName;
		Email = email;
		MobileNumber = mobileNumber;
		Gender = gender;
	}

	public String getFisrtName() {
		return FisrtName;
	}

	public void setFisrtName(String fisrtName) {
		FisrtName = fisrtName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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
		return "SignUp [FisrtName=" + FisrtName + ", LastName=" + LastName + ", UserName=" + UserName + ", Email="
				+ Email + ", MobileNumber=" + MobileNumber + ", Gender=" + Gender + "]";
	}
	
}
