package com.class09;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display “Congratulations!!. You got it!”
		 * 
		 */

		boolean number = true;

		Scanner scan = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Please enter your guess number,Hint its between 1 to 20");
			int guess=scan.nextInt();
			
			
			if(guess==5) {
				System.out.println("Congratulations!!");
				break;
			}else if(guess<5) {
				System.out.println("number is small");
			}else if(guess>5){
				System.out.println("number is large");
			}
			
		}while(true);

	}

}
