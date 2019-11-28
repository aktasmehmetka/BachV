package com.class26;

public class EmployeeTest {

	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.salary=5000;
		emp.getPay();
		
		FullTime fl=new FullTime();
		fl.bonus=1000;
		fl.salary=6000;
		fl.getPay();
				
	}
}
