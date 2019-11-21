package com.class18;

public class Task2 {

	// Create a method that will take a number and prints whether the number is even or odd.
	int num;
	void oddOrEven(int a) {
		if(a%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
	
	public static void main(String[] args) {
		
		Task2 a=new Task2();
		a.oddOrEven(20);
	}
}
