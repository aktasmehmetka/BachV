package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car.make="Toyota";
		Car car1=new Car();
		car1.color="Yellow";
		car1.model="Camry";
		car1.speed=200;
		car1.doors=2;
		car1.getDetails();
		System.out.println("=================");
		
		
		BetterCar.make="Toyota";
		BetterCar betterCar1=new BetterCar("Corolla", "White", 180,5);
		
		betterCar1.getDetails();
		
		
		Car car2=new Car();
		car2.color="Black";
		car2.model="Pirus";
		car2.speed=250;
		car2.doors=4;
		car2.getDetails();
		
		Car car3=new Car();
		car3.getDetails();
	}
	
}
