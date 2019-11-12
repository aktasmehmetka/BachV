package com.class17;

public class Dog {

	String genus, color;
	int weight;
	
	Dog(String g, String c, int w){
		this.genus=g;
		this.color=c;
		this.weight=w;
	}
	
	void bark() {
		System.out.println("The dog "+this.genus+" can bark");
	}
	void eat() {
		System.out.println("The dog "+this.genus+" can eat");
	}
	void sleep() {
		System.out.println("The dog "+this.genus+" can sleep");
	}
	public static void main(String[] args) {
		
//		Dog dog1=new Dog();
//		dog1.genus="Husky";
//		dog1.color="Black";
//		dog1.weight=5;
//		
//		dog1.bark();
//		dog1.sleep();
//		dog1.eat();
//		
//		System.out.println("\n");
//		
//		Dog dog2=new Dog();
//		dog2.genus="Bulldog";
//		dog2.color="White";
//		dog2.weight=6;
//		
//		dog2.sleep();
//		dog2.eat();
//		dog2.bark();
		
		Dog dog1=new Dog("Labrador", "color", 10);
		Dog dog2=new Dog("Bulldog", "color", 15);
		
		dog1.bark();
		dog1.sleep();
		dog1.eat();
		
		dog2.bark();
		dog2.sleep();
		dog2.eat();
		
	}
	
}
