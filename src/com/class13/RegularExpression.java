package com.class13;

public class RegularExpression {

	public static void main(String[] args) {

		// print only text and not number

		String str = "12364Hel6496526lo6596123";

		System.out.println(str.replaceAll("[0-9]", ""));// leave only text

		System.out.println(str.replaceAll("[a-zA-Z]", ""));// leave only numbers

		// Remove everything except and numbers
		String str2 = "Hi#$%^&*()_)(*&^%";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));// ^ bu isaret cumlenin icinde sadece bunlari kaldir
																// anlaminda
		
		
		System.err.println(str2.replaceAll("\\W", ""));// bu da ikinci yol cumlenin icindeki butun harf disinda kaldirir 

		String str3="12-25-1987";// 12/25/1987
		
		System.out.println(str3.replace('-', '/'));
		
		
	}
}
