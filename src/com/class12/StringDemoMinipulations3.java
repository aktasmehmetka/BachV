package com.class12;

public class StringDemoMinipulations3 {

	public static void main(String[] args) {

		/*
		 * This method checks whether a String is empty or not. This method returns true
		 * if the given string is empty, else it returns false.
		 * 
		 */

		String str = "";
		System.out.println("Is this  method is empty= " + str.isEmpty());

		if (!str.isEmpty()) {
			System.out.println("This is not empty");
		} else {
			System.err.println("This is empty String");
		}

		String sen = "";

		System.out.println("=====================");
		/*
		 * This method appends one String to the end of another. The method returns a
		 * String with the value of the String passed in to the method appended to the
		 * end of the String used to invoke this method.
		 * 
		 */

		String str3 = "Hello "; // stringin icinde bosluk brakarak cumlenin dzdun yazilmasini saglaya biliriz
								// her biten kelimenin sonuna bosluk birkabilirc bu sekilde
		String str4 = "World ";
		String str5 = "People";

		System.out.println(str3 + str4 + str5); // 1 way
		System.out.println(str3.concat(str4).concat(str5)); // 2 way tercih edilen yol

		System.out.println("=================");

		/*
		 * This method returns a copy of the string, with leading and trailing
		 * whitespace omitted.
		 */

		String str6 = " How are you? "; // cumlenin basinda bosluc var ama bu yontem bize bu boslugun kaldirilmasini
										// sagliyor
		System.out.println(str6.trim());

		System.out.println("================");

		/*
		 * This method returns the character located at the String’s specified index.
		 * The string indexes start from zero.
		 */
		// bize kacinci harfi istiyorsak vercektir

		String str7 = "We might be done early tody";
		System.out.println(str7.charAt(5));

		System.out.println("=============");

		/*
		 * This method returns the index within this string of the first occurrence of
		 * the specified character or -1 if the character does not occur.
		 */

		String str8 = "We might mnot be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m', 4));// 4 uncu harfe kadar bak icinde kac tane m varsa yazalim anlaminda

	}
}
