package com.class11;

public class Task {

	public static void main(String[] args) {

		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		String[] cars = { "camry", "avensis", "focus", "maxima", "altima", " rav4" };

		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("========================");
		// Task 2
		// Create an array on integers and calculate the sum of all elements in an array

		int[] nums = { 1, 4, 6, 9, 35, 78, 65 };
		int sum = 0;

		for (int element : nums) {

			// System.out.println(element);
			sum = sum + element;

		}
		System.out.println("The sum is " + sum);

		System.out.println("=========================");

		// task 3
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country. (use 2 different loops).
		
		String [] country= {"USA", "Turkey", "Germany"};
		
		for(String capital:country) {
			
			switch(capital) {
			
			case"Turkey":
				System.out.println("Ankara");
				break; 
			case"USA":
				System.out.println("DC");
				break;
			case"Germany":
				System.out.println("Berlin");
				break;
			
			}
		}
		
		System.out.println("==================");
		// 2 way
		
        String [] country1= {"USA", "Turkey", "Germany"};
		
		for(String getCapital:country1) {
			if(getCapital.equals("USA")) {
				System.out.println("DS");
		}else if(getCapital.equals("Turkey")) {
			System.out.println("Ankara");
		}else if(getCapital.equals("Germany")) {
			System.out.println("Berlin");
		}
			
			System.out.println("The capital is "+getCapital);
		}
		
 	}
}
