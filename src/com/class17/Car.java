package com.class17;

public class Car {

	// define attributes/features

	String make,model, color;
	int year, wheels, windows, speed;
	
	// behaviors(davranislar) ayni zamanda birer method dur yani method seklinde yaziyoruz
	
	void drive() {
		System.out.println("You can drive "+this.make+" "+this.model);
	}
	void start() {
		System.out.println("you can start "+this.make+" "+this.model);
	}
	void accelerate() {
		System.out.println("You can accelerate "+this.make+" "+this.model);
	}
}
