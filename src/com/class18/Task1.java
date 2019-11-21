
package com.class18;

public class Task1 {

	
	// Create a method that will take 2 parameters as a numbers and prints which number is larger.
	int number;
	
	void largerNumber(int num1, int num2) {
		if(num1>num2)
			number=num1;
		else
			number=num2;
		System.out.println("The larger number is "+number);
	}
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.largerNumber(5, 10);
	}
}
