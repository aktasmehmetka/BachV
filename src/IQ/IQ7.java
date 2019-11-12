package IQ;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		
		//Write a Java Program to find whether a String is palindrome or not? 
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Pleaseenter any world to polindrom or not");
		
		String str=scan.nextLine();
		
		String reversed="";
		
		for (int i =  str.length()-1; i <=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		System.out.println(reversed);
		
		if(reversed.equals(reversed)) {
			System.out.println("String is polindrom");
		}else {
			System.out.println("String is NOT polindrom");
		}
		
	}
}
