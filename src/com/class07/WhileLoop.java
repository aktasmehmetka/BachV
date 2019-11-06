package com.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time = 8;
		if (time < 12) { // condition is true
			System.out.println("Good morning"); // code 1 executes 1
		}
		System.out.println("----------------");
		while (time < 12) { // if condition is true
			System.out.println("good morning"); // code executes infinitely-- infinity loop
			time++;
		}
		// I want to print DA 5 times
		int i=-1;
		
		while(i<4) {
			System.out.println("Good Afternoon");
			i++;
		}
		System.out.println("outside of loop");

	}

}
