package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		
		String str="Today is Saturday is java day";
		
		String[] array=str.split("\\s");
		
		for (int i = array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		String str1="Welcome to java calss";
		
		char[] arr=str1.toCharArray();
		
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
