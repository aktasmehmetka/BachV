package com.class27;

public class Student {

	/*
	 * Create a Class Student that will have 3 subclasses as SyntaxStudent,
	 * CollegeStudent, SchoolStudent.
	 * 
	 * Define common behavior within parent class and override some of the methods
	 * in child classes Define some methods specific to child classes Write example
	 * of achieving run time polymorphism
	 */

	public void display() {
		System.out.println("I am a student");
	}

	public void studentCard() {
		System.out.println("I have a sudent card");
	}

}

class SyntaxStudent extends Student {
	public void display() {
		System.out.println("I am a student");
	}

	public void schoolName() {
		System.out.println(" I am a student from SyntaxStudent");
	}

	public void studentCard() {
		System.out.println("I have a sudent card");
	}

}

class CollegeStudent extends Student {
	public void display() {
		System.out.println("I am a student");
	}

	public void schoolName() {
		System.out.println(" I am a student from CollegeStudent");
	}

	public void studentCard() {
		System.out.println("I have a sudent card");
	}

}

class SchoolStudent extends Student {
	public void display() {
		System.out.println("I am a student");
	}

	public void schoolName() {
		System.out.println(" I am a student from SchoolStudent");
	}

	public void studentCard() {
		System.out.println("I have a sudent card");
	}

}