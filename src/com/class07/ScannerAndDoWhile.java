package com.class07;

import java.util.Scanner;

public class ScannerAndDoWhile {

	public static void main(String[] args) {
		
		/*
		 * ask user to enter 5 times and our output should be "Good afternoon____"
		 */

		Scanner scan = new Scanner(System.in);

		int i = 5;
		while (i < 10) {
			System.out.println("Please enter your name");
			
			String name = scan.nextLine();
			
			System.out.println("Good afternoon " + name);
			i++;
		}

	}

}
