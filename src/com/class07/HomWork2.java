package com.class07;

import java.util.Scanner;

public class HomWork2 {

	public static void main(String[] args) {

		/*
		 * you need to ask user to pay for coffee you need to keep asking user to pay
		 * for it until entered price is equal=5; after user paid then say
		 * "Enjoy your coffee"
		 */

		Scanner scan = new Scanner(System.in);

		int price;

		do {
			System.out.println("Please pay for your coffee");
			price = scan.nextInt();

		} while (price != 5);

		System.out.println("Enjoy your coffee");

		// 2 way with wile

		int price1;
		System.out.println("Please pay for your coffee");
		price1 = scan.nextInt();

		while (price1 != 5) {
			System.out.println("Please pay for your coffee");
			price1 = scan.nextInt();
		}
		System.out.println("Enjoy your coffee");

	}

}
