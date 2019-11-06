package com.class14;

public class SplitMethod {

	public static void main(String[] args) {

		/*
		 * .split(); This method split this string around matches of the given regular
		 * expression
		 */
		// split the following string into array of strings/work
		String str = "Video provides a powerful way to help you prove your point.";

		String[] array=str.split(" ");// butun bosluklardan sonra basilmasini istiyor

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\n");
		// How can we find how many sentence are in the following string
		
		String str1="Today is Sunday. its sunny day. and we have java class";
		
		String[] array2=str1.split("\\.");// bu sytax bize kac tane cumle oldugunu veriyor
		
		System.out.println("The number of SENTENCES is giving us:: "+array2.length);// cumle sayisini veriyor
		
		for (String string : array2) {
			System.out.println(string.trim()); // eger trim koymazsak cumleleri ayirirken basta boslik kalir.
		}
		
		

	}
}
