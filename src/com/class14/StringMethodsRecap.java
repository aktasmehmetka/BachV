package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {

		// .replace
		String str = "Your Syntax Technologies";
		System.out.println(str.toLowerCase().replace('y', 'i'));// eger buyuk ve kucuk harfleri kaldirmak istiyorsan
																// toLowercase veye ekleyince ikisinide alir

		System.out.println("\n");
		System.out.println(str.replace("Your", "My"));

		System.out.println("\n");

		// .replace

		String str1 = "";// cumleyi yazmayi unutmusum;)

		System.out.println(str1.replaceAll("way(,*)", ""));

		String str3 = "296629Hell65646o";

		System.err.println(str3.replaceAll("[^0-9]", ""));// ayni seyler ikiside ayni islemi yapiyor. sadece sayi kalsin
		System.err.println(str3.replaceAll("[a-zA-Z]", ""));// sadece harfleri al

		System.out.println(str3.replaceAll("[^A-z]", ""));// sadece sayilari kaldiriyor.yani sadece harsler kalsin

		// .replaceAll
		String str2 = "Video provides a powerful way to help you prove your point. "
				+ "When you click Online Video, you can paste in the embed " 
				+ "code for the video you want to add. ";
		
		System.out.println(str2.replaceAll("to(.*)", ""));// to dan sonra to dahil basmayalim 

		String str4 = "23423Hell3049o^&*^&*$%$";
		System.out.println(str4.replaceAll("[0-9]", ""));// sadece sayilari al
		System.out.println(str4.replaceAll("[^a-zA-Z^]", ""));// harfler ve ^ bu isaret kalsin 

		System.out.println("**************");
		System.out.println(str2.replaceFirst(" ", ""));// sadece ilk boslugu kaldir

	}
}
