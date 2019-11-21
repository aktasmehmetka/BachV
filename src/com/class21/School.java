package com.class21;

import com.class20.*;// ctrl+shift ile import ediyoruz. * isareti butun package import ediyor

public class School {

	public static void main(String[] args) {
		Myself m=new Myself();
		
		Student student1=new Student();
		student1.studentName="Eric";
		student1.GPA=3.95;
		student1.school="Syntax";
		
		student1.displayInfo();
		student1.study(3);
		
		Student student2=new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="Syntax";
		
		student2.displayInfo();
		
		
	}
}
