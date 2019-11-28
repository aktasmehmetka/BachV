package com.class26;

public class FullTime extends Employee {

	int bonus;

	public void getPay() {// method overiding .Eger anne class ta ve cocuk cclasslarda ayni method varsa
							// method overiding diyoruz
		System.out.println(" Full time Employee gets paid " + salary + " and bonus " + bonus);
	}
}
