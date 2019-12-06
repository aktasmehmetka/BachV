package com.class28;

public class userClass {

	/*
	 * Write program: userClass that has a constructor that initializes name and
	 * mobile number instance variables. Create a subclass userInfo that will have
	 * user address variable and it also being initialized through constructor call.
	 * Print users name, mobile number and address in userDetails method. Test your
	 * code.
	 * 
	 */
	
	String name;
	String number;
	
	userClass(String name, String number){
		this.name=name;
		this.number=number;
	}
	
	public static void main(String[] args) {
		
		userInfo a=new userInfo("Ali","12335648","102 test dr");
		a.userDetails();
	}
}

class userInfo extends userClass{
	
	userInfo(String name, String number, String address) {
		super(name, number);
		this.addres=address;
	}

	String addres;
	
	public void userDetails(){
		System.out.println(this.name);
		System.out.println(this.number);
		System.out.println(this.addres);
	}
}