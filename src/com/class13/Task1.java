package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your your class day:: ");
		String day = scan.nextLine();
		String day1 = day.toLowerCase();/// if you wanrt you can used this one too

		if (day.trim().toLowerCase().equals("Sturday")) {
			System.out.println("Sturday is java class");
		} else if (day.trim().toLowerCase().equals("Sunday")) {
			System.out.println("Sunday is your Git class");
		} else if (day.trim().toLowerCase().equals("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");
		} else if (day.trim().toLowerCase().equals("Thursday")) {
			System.out.println("Thursday is your Manuel Testing class");
		} else {
			System.err.println("Envalid Entry!! Please enter a valid class day");
		}

	}
}
