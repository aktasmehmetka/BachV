package com.class08;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * write a code to find the sum of even & odd numbers from rance1 to 20
		 * expecting 2 outputs sum for odd nums=.. sum for even nums=..
		 * 
		 */

		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 1; i <= 20; i++) {
			// sumOdd=sumOdd+i;
			// sumEven=sumEven+i;
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);

	}

}
