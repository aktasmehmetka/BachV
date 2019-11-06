package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		// I want to print all value from an array
		//when value is a Dog-->I  love dogs

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		int size = animals.length;
		for (int i = 0; i < size; i++) {
			// if (i==1)
			if (animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			} else {
				System.out.println(animals[i]);
			}
		}
	}
}
