package com.class19;

public class Task {

	/*
	 * Create a method createEmail(). Based on provided users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * johnsnow@gmail.com or johnsnow@yahoo.com*
	 * 
	 * Write a method to return whether given number is prime or not?
	 * 
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 */

	String createEmail(String name, String lastName, String emailType) {

		String email = name + lastName + "@" + emailType + "com";

		return email;

	}

	// second task

	 boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}
	 char getGrade(int score) {
	        char grade;
	        if(score>=90) {
	            grade='A';            
	        }else if (score>=80 && score<90) {
	            grade='B';    
	        }else if (score>=70 && score<80) {
	            grade='C';    
	        }else if (score>=50 && score<70) {
	            grade='D';    
	        }else {
	            grade='F';
	        }
	        return grade;
	    }
	 

	public static void main(String[] args) {

		Task task1 = new Task();
		String email = task1.createEmail("mehmet", "aktas", "yahoo");
		System.out.println(email);
		boolean isPrime=task1.isPrime(11);
		System.out.println(isPrime);
		char grade=task1.getGrade(85);
		System.out.println(grade);
		
		
		
	}

}
