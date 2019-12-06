package com.class27;

public class TaskTest {

	public static void main(String[] args) {
		SyntaxStudent1 ss=new SyntaxStudent1();
		ss.study();
		//ss.doHomework();ce: not visible since method inside child is private
		ss.attendClasses();
		ss.research();
		
		Task student=new SyntaxStudent1();
		student.study();
		student.research();
		student.attendClasses();
		//student.doHomework();ce: not visible since method inside parent is private
	}
}
