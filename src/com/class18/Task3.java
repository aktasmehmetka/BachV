package com.class18;

public class Task3 {

	//Create a method that will print whether given String is palindrome or not.
	
	void isPolidrom(String str) {
		
		String reversed = "";
			
		//char[] arr=str.toCharArray();
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		if(str.equals(reversed)) {
			System.out.println("str is polindrom");
		}else {
			System.out.println("str is NOT polindrom");
		}
	}
	
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.isPolidrom("home");
		obj.isPolidrom("kayak");
	}
}
