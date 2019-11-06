package com.class08;

public class ForLoopExamples {

	public static void main(String[] args) {

		// print numbers from 1-100 in 1 line with space

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		// pint numbers from 100-1

		for (int i = 100; i >= 1; i--) {
			System.out.println(i + " ");
		}
		System.out.println("++++++++++++++++++++++++++++++++");

		// print even numbers from 20-1(2 ways)

		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("++++++++++++++++++++++++++++++++");

		// print odd numbers between 20 and 50 (2 ways)

		for (int i = 20; i <= 50; i++) {

			if (i % 2 != 0) {

				System.out.println(i + " ");
			}
		}
		// 2 way
		
		int j=20;
		
		while(j<=50) {
			
			if (j % 2 != 0) {

				System.out.println(j + " ");
				j++;
			}
		}

	}

}
