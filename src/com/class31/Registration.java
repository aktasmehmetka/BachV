package com.class31;

public class Registration {

	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, username and
	 * password. Requirements:
	 * 
	 * 1-Valid email consider to be only gmail 
	 * 2-Valid userName and password cannot be
	 * empty and should be of length larger than 6 characters. Also valid password
	 * cannot contain userName.
	 */

	private String email;

	private String userName;

	private String password;

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {

		this.email = email;

	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void dispaly() {
		System.out.println("My email is " + email + " user name " + userName + " pass is " + password);
	}

}
