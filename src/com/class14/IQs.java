package com.class14;

public class IQs {

	public static void main(String[] args) {

		// Find out how many alpha characters present in a string?

		String str = "he987654$%^&*()llo";

		String str1 = str.replaceAll("[^a-zA-Z]", "");

		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println("\n");

		// Write a java program to reverse String? Reverse a string word by word?

		String str2 = "Write a java program to reverse String? Reverse a string word by word?";

		char[] array = str2.toCharArray();

		for (int i = str2.length()-1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
			
		// System.out.println(array[i]);

		// How to find out the part of the string from a string? What is substring? Find
		// number of words in string?

		// you can find part of the string from a string with indexOf() or contains();
		// string methods.
		// What is substring? ==>This method has two variants and returns a new string
		// that is a substring of this string
		String str3 = "How to find out the part of the string from a string?";

		System.out.println(str3.length());

	}
}
