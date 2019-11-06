package com.class12;

import java.util.Scanner;

public class HomeWork {

	private static Object password1;

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements: 
		 * Username and Password cannot be empty, if so→ message=“Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=“Password is too short”. Password cannot contain username if
		 * so, → message=“Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */

		Scanner scan =new Scanner(System.in);
		
		String username, password;
		
		do {
			System.out.println("Please enter your user name");
			username=scan.nextLine();
			password=scan.nextLine();
			
			if(username.isEmpty()) {
				System.out.println("Username cannot be empty");
			}
			
			
		}while(username.isEmpty());
		
		do {
			System.out.println("Please enter your password");
			password=scan.nextLine();
			
			if(password.length()<8) {
				System.out.println("Password is too short");
			}else if(password.contains(username)) {
				System.out.println("Password cannot contain user name");
			}else if(password.isEmpty()) {
				System.out.println("Password cannot be empty");
			}else if(password.length()>20) {
				System.out.println("password is too long");
			}
		}while(password.isEmpty() || password.contains(username) || password.isEmpty());
		
		do {
			System.out.println("Please confirm your password");
			
			String password1=scan.nextLine();
			if(password1.equals(password)) {
				System.out.println("Your username and password have ben created :)");
			}else {
				System.out.println("Your passwords do not match!! Try again.");
			}
		}while(!password1.equals(password));
		
	}

}
