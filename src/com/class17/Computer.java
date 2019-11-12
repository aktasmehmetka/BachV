package com.class17;

public class Computer {

	String screen, brand, name;
	int ram, memory;
	boolean keybord, monitor;
	
	void playGame(){
		System.out.println("I can play on my "+name);
	}
	void JavaCoding(){//method header
		//method body
		System.out.println("I can do Java coidng on my "+name);
	}
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
	//asagida method lari cagirmadan excute edemeyiz. oncelikle asagida yazmamiz lazim
	public static void main(String[] args) {
		
		Computer com1=new Computer();
		com1.brand="Apple";
		com1.name="MacBook";
		com1.keybord=true;
		com1.monitor=false;
		com1.ram=8;
		com1.memory=248;
		
		
		
		System.out.println("\n");
		Computer com2=new Computer();
		com2.brand="HP";
		com2.name="Model3452";
		com2.keybord=true;
		com2.monitor=false;
		com2.ram=16;
		com2.memory=500;

		
		System.out.println("I have "+com2.brand+" "+com2.name+" "+"it has "+com2.memory+" GBT memory");
		com1.JavaCoding();
		com1.playGame();
		com1.watchMovie();
		
	}
}
