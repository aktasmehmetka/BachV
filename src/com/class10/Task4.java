package com.class10;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 */

		String[] country = { "Turkey", "USA", "Germany", "Italy", "Franch" };

		for (int i = 0; i < country.length; i++) {

			if (country[i].equals("Turkey")) {
				System.out.println("Capital is  Ankara");
			} else if (country[i].equals("USA")) {
				System.out.println("Capital is DC");
			} else if (country[i].equals("Germany")) {
				System.out.println("Capital is Berlin");
			} else if (country[i].equals("Italy")) {
				System.out.println("Capital is Rome");
			} else if (country[i].equals("Franch")) {
				System.out.println("Capital is Paris");
			}
			// System.out.println();
		}

	}

}
