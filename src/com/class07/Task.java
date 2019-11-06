package com.class07;

public class Task {

	public static void main(String[] args) {
		
		boolean workDay = true;

		int d = 1;

		while (d < 6) {
			System.out.println("I need day off");
			d++;
			if (d == 6) {
				System.out.println("I don't need day off");
			}
		}

		System.out.println("============================");
		// 2. way

		// boolean wd=true;
		int da = 1;
		while (workDay) {

			if (da == 6) {
				System.out.println("i do not need a day of anymore ");
				workDay = false;
			} else {
				System.out.println("I need a day of");
			}
			da++;
		}

	}

}
