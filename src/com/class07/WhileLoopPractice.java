package com.class07;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		// print values from 50 to 20
		
				int m=50;
				
				while(m>=20) {
					System.out.println(m+" ");
					m--;
				}
				
				int y=10;
				
				while(y<=30) {
					System.out.print(y+" ");
					y++;
				}
				
				// print only odd number from 50 to 100
				
				int k=50;
				
				while(k<=100) {
					System.out.println(k+" ");
					k+=2;
					//if(!(k%2==1)) {
						//System.out.println(k);
					}
				
				int w=50;
				while(w<=100) {
					if(!(w%2==0)) {
						System.out.println(w);
					}
					w++;
				}

				int d=100;
				while(d>=1) {
					if(d%2==0) {
						System.out.println(d);
					}
					d--;

				}

	}

}
