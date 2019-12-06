package com.class26;

public class Degree {
	

public static void main(String[] args) {
		
		Degree d=new Degree();
		d.getDegre();
		
		Undergraduate u=new Undergraduate();
		u.getDegre();
		
		Postgraduate p=new Postgraduate();
		p.getDegre();
}

	public void getDegre() {

		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree {

	public void getDegre() {

		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree {

	public void getDegre() {

		System.out.println("I am a Postgraduate");
	}
}
