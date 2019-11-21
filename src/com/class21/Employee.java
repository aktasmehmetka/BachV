package com.class21;

public class Employee {

//	/*
//	 * CreateaClass calledEmployee:
// Create three variables eID , salary
//and set the CEO to “Sumair”
// Create two objects of the class
//Employee Set the value of eID, salary for each of
//the objects Print out the eID , salary and CEO for
//each of the objects
//	 */
	
	public int eID;
	public int salary;
	public static String CEO="Sumair";
	
	public void displayInfo() {
		System.out.println("Name's CEO is "+CEO+" eID is"+eID+" he's salary "+salary);
	}
	
	public static void main (String[]args) {
		
		Employee obj=new Employee();
		obj.eID=1569845;
		obj.salary=6000;
		obj.displayInfo();
		
		Employee obj1=new Employee();
		obj1.eID=1569845;
		obj1.salary=6000;
		obj1.displayInfo();
	}
	
}

