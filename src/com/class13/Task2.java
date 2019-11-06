package com.class13;

public class Task2 {

	public static void main(String[] args) {

		// Create a String and print it in reverse order (Sunday → yadnuS).

		// Create a String and if the String is not empty perform the following: if the
		// String has an odd number of characters and has 3 or more characters, print
		// the character in the middle of the String.

		String str = "sunday";

		char[] str1 = str.toCharArray();

		for (int i = 5; i >= 0; i--) {
			System.out.print(str1[i]);
		}

		System.out.println("\n=============");

		String str2 = "Hellou";

		if (!str2.isEmpty()) {
			if (str2.length() % 2 != 0) {
				System.out.print(str2.charAt(str2.length() / 2));
			} else {
				System.err.println("Error");
			}

		}

	}
}
