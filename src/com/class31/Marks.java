package com.class31;

public abstract class Marks {

	/*
	 * We have to calculate the percentage of marks obtained in three subjects (each
	 * out of 100) by student A and in four subjects (each out of 100) by student B.
	 * Create class ‘Marks’ with an abstract method ‘getPercentage’. It is inherited
	 * by classes ‘A’ and ‘B’ each having a method with the same name which returns
	 * the percentage of the students. The constructor of student A takes the marks
	 * in three subjects as its parameters and the marks in four subjects as its
	 * parameters for student B. Test your code
	 */
	
	
	
	abstract int getPercentage();
	
}

class StudentA extends Marks{
	
	int grade1, grade2,  grade3, grade4;
	
	
	public StudentA(int grade1, int grade2, int grade3) {
		super();
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		
	}

	

	@Override
	public int getPercentage() {
		 int getPercentage=(grade1+grade2+grade3)/3;
		return getPercentage;
	}
	
}

class StudentB extends Marks{
	
	int grade1, grade2,  grade3, grade4;
	
	public StudentB(int grade1, int grade2, int grade3,int grade4) {
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		this.grade4=grade4;
	}

	@Override
	int getPercentage() {
		int getPercentage=(grade1+grade2+grade3+grade4)/4;
		return getPercentage;
	}
	
}
