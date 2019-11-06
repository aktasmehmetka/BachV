package com.class10;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using element of array: “Saturday is Java coding Day”.
		 * 
		 */
		
		String[] array=new String[4];
		 
		array[0]="Java";
		array[1]="Saturday";
		array[2]="day";
		array[3]="coding";
		
		System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);

		// 2 way 
		
		for(int i=0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");
		}
	}

}
