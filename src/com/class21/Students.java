package com.class21;

public class Students {

	/*
	 * Create a Class called Students
● Create three variables studentName , studentID and numberOfStudents
● Create three objects of the Students Class
● Set the value for studentName , studentID and increment the numberOfStudents for each object
● Print out total number of student
	 */
	
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	public void displayInfo() {
		System.out.println(studentName+" "+studentID+" "+numberOfStudents);
	}
	
	public static void main(String[] args) {
		
		
		Students s1=new Students();
		
		s1.studentName="ALI";
		s1.studentID=456;
		
		
	
	}
	
}
