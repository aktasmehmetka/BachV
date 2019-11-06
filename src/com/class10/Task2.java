package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 
		 */
		
		String[] name=new String[3];
		
		name[0]="Ahmet";
		name[1]="Ali";
		name[2]="Mustafa";
		
		System.out.println(name[0]+" "+name[1]+" "+name[2]);
		
		System.out.println("==============================");
		
		String [] array= {"Ahmet", "Ali", "Mustafa"};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(array.length);

	}

}
