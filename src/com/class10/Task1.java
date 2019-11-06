package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 
		 */

		char[] grades = new char[6];

		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[0]);
		System.out.println(grades[1]);

		// 2 way
		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F' };

		String[] animals = { "Cat", "dog", "cow", "snake", "elephant" };

		int size = animals.length;

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i] + " ");
		}
		// create an array to sore 5 double values, print all in 1 line

		double[] array1 = { 12.5, 45.6, 3.2, 23.5 };

		int a = array1.length;

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Double number are : " + array1[i] + " ");
			
			System.out.println("==============================");
		}

	}

}
