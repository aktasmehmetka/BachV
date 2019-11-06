package com.class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		
		String str="Hello dear dan, how are you dan, how you been";
		
		System.out.println(str.replace('n', 'z'));
		
		System.out.println("\n");
		System.out.println(str.replace("dan", "Ben"));// butun degerleri degistirecektir
		System.out.println("\n");
		System.out.println(str.replaceFirst("dan", "ALI"));// sadece ilk degeri degistirecektir
		
		System.out.println("\n");
		
		
	}
}
