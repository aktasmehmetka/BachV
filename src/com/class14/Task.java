package com.class14;

public class Task {

	public static void main(String[] args) {

		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces. ​
		 * 
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * 
		 * ​ You have a String a=”Is it saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 * 
		 */

		String str = "Create a String that will hold a sentence. Write a program to get a new\r\n"
				+ "		 * String without any spaces";

		String[] array = str.split("");

		for (String string : array) {
			System.out.print(string.trim());
		}

		// 2 way

		System.err.println(str.replaceAll(" ", ""));

		System.out.println("\n");

		String str2 = "He63945$%^&*546llo";

		String str3 = str2.replaceAll("[^a-zA-Z]", "");

		System.out.println(str3.length());

		System.out.println("\n");

		// You have a String a=”Is it saturday? Is it
		// raining? Do we have a Java Class today?” How would you find out how many
		// sentences are in that String?
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] a1=a.split("\\?");
		System.out.println(a1.length);

	}

}
