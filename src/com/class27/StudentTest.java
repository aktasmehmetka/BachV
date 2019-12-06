package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new SyntaxStudent();
		Student s2=new CollegeStudent();
		Student s3=new SchoolStudent();
		
		Student[] s= {s1,s2,s3};
		for(Student st:s) {
			st.display();
			st.studentCard();
		}
	}
}
