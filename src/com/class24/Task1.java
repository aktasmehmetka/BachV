package com.class24;

public class Task1 {

	public String name, lastName;
	int age;
	/*
	 * Write a program that will have a 4 different access levels of constructors
	 * and create 3 objects of this class: 1 - inside same class; 2 - from outside
	 * the class and observe result. 3 - from different class inside different
	 * package
	 * 
	 * 
	 * Write program that have static constructor and observe result.
	 */

	public Task1(String name, int age) {
		System.out.println("I am public constructor");
		System.out.println(name + " " + age);
	}

	Task1() {
		System.out.println("I am non-argumant constructor");
		System.out.println("I am default constructor");
	}

	protected Task1(String ad, String soyad) {
		System.out.println(ad + " " + soyad);
		System.out.println("I am protected constructor");
	}

	private Task1(int num1, int num2) {
		System.out.println(num1 + " " + num2);
		System.out.println("I am private constructor");

	}

	public static void main(String[] args) {

		Task1 task = new Task1();
		Task1 task1 = new Task1("ali", 15);
		Task1 task2 = new Task1("kaya", "ari");
		Task1 task3 = new Task1(15, 20);

	}
}
