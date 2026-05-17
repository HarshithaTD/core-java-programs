package com.basics;

public class Loops {
	public static void main(String[] args) {
		
		//for loop 
		
		for(int i=1;i<=5;i++)
		{	System.out.println("Hi");
		
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		//while loop
		
		int k=1;
		while(k<=5) {
			System.out.println("Hello");
			k++;
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		//do while loop
		
		int x=1;
		do { 
			System.out.println("bye");
			x++;
		}while(x<=5);
		
		System.out.println("------------------------------------------------------------------------------");	
		// example of 
		 x=1;
		do { 
			System.out.println("harshi");
			x++;
		}while(x<=0);
		
		System.out.println("------------------------------------------------------------------------------");
		
	   //nested loops
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
}
}
