package com.class23;

public class Task1 {

	/*
	 * Write a program that will have a constructor: one with parameters and second
	 * without any parameters. Create a separate Test class where you will execute
	 * both of the constructors. */
	public static String name;
	public String lastName;
	public int grade;
	
	Task1() {

	}

	Task1(String name, String lastName, int grade) {

		
		System.out.println("I am in constructor and my name "+name+" "+lastName+ " my garde is "+grade );
	}
	

	public static void main(String[] args) {

		Task1 obj = new Task1("mehmet", "aktas", 85);
		
	}
}
