package com.class17;

public class Phone {

	String model, brand, OS;
	int ram, price;
	
	void call() {
		System.out.println("You can call "+this.brand+" brand "+this.model);
	}
	void playGame() {
		System.out.println("You can play "+this.brand+" brand "+this.model);
	}
	void takePicture() {
		System.out.println("You can take picture "+this.brand+" brand "+this.model);
	}
	
	public static void main(String[] args) {
		
		Phone phone1=new Phone();
		phone1.model="Iphone 11";
		phone1.brand="Apple";
		phone1.OS="ISO";
		phone1.ram=8;
		phone1.price=1000;
		
		phone1.call();
		phone1.playGame();
		phone1.takePicture();
		
		System.out.println("\n");
		Phone phone2=new Phone();
		phone2.model="Galaxi 11";
		phone2.brand="Samsung";
		phone2.OS="Android";
		phone2.ram=10;
		phone2.price=999;
		
		phone2.call();
		phone2.playGame();
		phone2.takePicture();
		
	}
}
