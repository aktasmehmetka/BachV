package com.class14;

public class SpliteMethod2 {

	public static void main(String[] args) {

		// how to separate comma delimited

		String str = "if you come to class early," + "then you can study more, also you can learn more"
				+ " and you can leave early";

		String[] array = str.split(",");
		for (int i = 0; i < array.length; i++) {
			System.err.println(array[i]);
		}
		System.out.println("\n");

		String str1 = "Welcom to syntax technoligies";
		String[] array1 = str1.split(" ", 4);// bu syntax bize kac tane cumleye ayirmak istiyorsak kullaniyoruz burada 3
												// cumleye ayir anlaminda

		System.out.println(array1.length);

		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

	}
}
