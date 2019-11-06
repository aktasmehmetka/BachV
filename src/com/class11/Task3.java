package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers
		// in 3 rows and 4 columns. Develop a program which will identify/print the even
		// numbers only.

		int[][] numbers = { { 1, 2, 3, 4 }, { 10, 7, 8, 9 }, { 14, 25, 78, 39 } };
		for (int[] a : numbers) {
			for (int b : a)
				if (b % 2 == 0) {
					System.out.print(b + ",");
				}
			System.out.println();
		}

		System.out.println("=======================");

		// Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.
		
		// print of sum of element 
		int sum=0;
		for(int[] num1:numbers) {
			for(int num2:num1) {
				sum+=num2;
			}
			
		}
		System.out.println("The sum of 2D array is "+sum);

	}

}
