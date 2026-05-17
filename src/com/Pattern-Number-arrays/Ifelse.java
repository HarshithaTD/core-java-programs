package com.basics;

public class Ifelse {
	public static void main(String[] args) {
		int p=60;
		// using if and else if 
		
		if(p>=85) {
			System.out.println("dist");
		}
		else if(p>=60) {
			System.out.println("first");
		}
		else if(p>=45) {
			System.out.println("second");
		}
		else if(p>=35) {
			System.out.println("Just pass");
		}
		else {
			System.out.println("Just fail");
		}
	
		// only using if 
		
		if(p>=85) {
			System.out.println("dist");
		}
		if(p>=60) {
			System.out.println("first");
		}
		if(p>=45) {
			System.out.println("second");
		}
		if(p>=35) {
			System.out.println("Just pass");
		}
		if(p<35) {
			System.out.println("Just fail");
		}

	}

}
