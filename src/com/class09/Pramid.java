package com.class09;

public class Pramid {

	public static void main(String[] args) {
		
		/**
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		/*1
		 * 22
		 * 333
		 * ...
		 * 999999999
		 */
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
System.out.println("===============================");
		
		/*99999999
		 * 88888
		 * 7777
		 * ..
		 * 1
		 */
		
		for(int i=9; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		

	}

}
