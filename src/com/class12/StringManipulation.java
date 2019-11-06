package com.class12;

public class StringManipulation {
	public static void main(String[] args) {

		// there are two ways to create string objects
		//
		// String literal

		String name = "John";
		System.out.println(name);
		name.length();

		System.out.println(name.length());
		System.out.println("================");
		// 2 way

		String name1 = new String("John1");
		System.out.println(name1);

		System.out.println("===================");
		/*
		 * This method returns thr lenght of this string the lenght is equal to the
		 * number of 16 bit unicode characters in the string
		 * 
		 */

		int name1Len = name1.length();

		System.out.println("The lenght of name1 is = " + name1Len);

		System.out.println("==================");
		// to Lower case
		//// this method convert all of the characters in this string to lowercase

		String str1 = "Hello World";
		System.out.println("Before: " + str1);
		str1 = str1.toLowerCase();
		System.out.println("After: " + str1);

		System.out.println("=================");
		
		 //.equals()
        //This method will count everything such
        //capitalization and content

		String str2 = "HElLo WORld";
		boolean isEqual = str1.equals(str2);
		System.out.println(isEqual);

		// .equalIsIgnoreCase(); ignorcase kullandigimizda buyuk kucuk fark etmez ikisi
		// bir birine esit ise true verir

		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println("-------------------------");
		
		//this method convert all of the characters in this string to uppercase
		//toUpperCase();
        // This method converts all of the characters in
        //this String to uppercase
		
		String str3="Mustafa";
		System.out.println("Before :: "+str3);
		str3=str3.toUpperCase();
		
		System.out.println("After :: "+str3);
		
		System.out.println("===============");
		
		// 
		
	}
}
