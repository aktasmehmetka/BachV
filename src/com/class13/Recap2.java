package com.class13;

public class Recap2 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";

		System.out.println(str1.contentEquals(str2));
		System.out.println(str1 == str2);

		System.out.println("=======================");
		String str3 = new String("Bye");
		String str4 = new String("Bye");

		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2);// true
		System.out.println("+==================");
		System.out.println(str3.contentEquals(str4));
		System.out.println(str3 == str4);// bu sekilde esit degil
		
		
	}

}
