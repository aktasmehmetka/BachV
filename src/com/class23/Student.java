package com.class23;

public class Student {

	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name. NOTE: please use
	 * different names for instance and local variables.
	 */

	String name;
	int grade1, grade2, grade3;

	Student(String studentName, int gr1, int gr2, int gr3) {
		name = studentName;
		grade1 = gr1;
		grade2 = gr2;
		grade3 = gr3;
	}

	public void caculateAverage() {
		int average = (grade1 + grade2 + grade3) / 3;
		System.out.println("Student " + name + " has an average grade of " + average);
	}

	public void hello() {
		System.out.println("hello " + name);
	}

	public static void main(String[] args) {
		Student student1 = new Student("John", 90, 78, 100);
		student1.caculateAverage();

		Student student2 = new Student("Anna", 90, 88, 100);
		student2.caculateAverage();

		Student student3 = new Student("Ibrahim", 88, 78, 100);
		student3.caculateAverage();

		Student student4 = new Student("Mehmet", 90, 88, 80);
		student4.caculateAverage();

		Student student5 = new Student("kasim", 90, 88, 80);
		student5.caculateAverage();
	}

}
