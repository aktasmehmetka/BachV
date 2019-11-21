package com.class22;

public class AccessingStaticVariable {

	public static void main(String[] args) {

		// her zaman age instance variable lara ulasmak istaedimizde kesinlikle obje
		// olusturmamiz lazim

		// eger static var. ulasmak istiyorsak className.variable seklinde
		// ulasabiliyoruz. className.StaticVariable seklinde de ulasabiliriz fakat
		// tercuh edilmiyor
		
		
			Husky obj=new Husky();
			System.out.println(obj.name);
			obj.name="Sharik";
			System.out.println(obj.name);
			
			System.out.println(Husky.breed);
			Husky.breed="New breed";
			System.out.println(obj.breed);//possible but not preferable

	}
}
