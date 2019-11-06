package IQ;

import java.util.Scanner;

public class IQ5 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number to check is prime number or not");

		int n = scan.nextInt();

		boolean flag = false;
		for (int i = 2; i <= n / 2; ++i) {
			// condition for nonprime number
			if (n % i == 0) {

				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");
	}
}
