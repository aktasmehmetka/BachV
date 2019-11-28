package com.class25_1;

public class Task {

	
	
	/*
	 * Create 1 class in which create a methods that will calculate the volume
	 * (area) of Rectangle Square Box Use separate class to test your code
	 * 
	 */
	
	void area(int a) {
		System.out.println("Square area is " +(a*a));
	}
	void area(int a, int b) {
		System.out.println("Rectangle area is " +(a*b));
	}
	void area(int a, int b, int c) {
		System.out.println("Box area is " +2*((a*b)+(a*c)+(b*c)));
	}
	
	public static void main(String[] args) {
		
		Task obj=new Task();
		obj.area(5);
		obj.area(5, 4);
		obj.area(5, 5, 5);
	}
	
	
}
