package com.class21;

public class Student {

	public String studentName;
	public double GPA;
	public String school;
	public int ID;
	
	public void displayInfo() {
		System.out.println(studentName+" attending "+school+" has a "+GPA+" of "+school);
	}
	
	protected void study(int hours) {
		
		System.out.println(studentName+" is studying for"+hours+ " hours");
	}
}
