package IQ;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {

		// Write a Java Program to print first 10 numbers of the Fibonacci series.

		int maxNumber = 0;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.println("How many numbers you want in Fibonacci:");
		Scanner scanner = new Scanner(System.in);
		maxNumber = scanner.nextInt();
		System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");
			
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}
}
