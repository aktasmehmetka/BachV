package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {

		/*
		 * This method convert this string to a new character array
		 */
		
		String str = "Syntax";
		char[] array = str.toCharArray();

		// System.out.println(str.toCharArray());

		for (char i : array) {
			System.out.println(i);
		}
		
		

	}
}
