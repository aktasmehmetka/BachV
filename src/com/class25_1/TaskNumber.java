package com.class25_1;

public class TaskNumber {

	/*
	 * Create 1 class with a static method that has 3 overloaded forms. Then call
	 * each overloaded method with specific arguments and observe result.
	 * 
	 */

	static void num(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
		}
	static void num(int num1,int num2,int num3){
		int sum=num1+num2+num3;
		System.out.println(sum);
		
	}
	static void num(int num1, int num2, int num3,int num4){
		int sum=num1+num2+num3+num4;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		TaskNumber obj=new TaskNumber();
		obj.num(12, 45);
		obj.num(12, 3, 15);
		obj.num(5, 5, 8, 76);
	}
	
}
