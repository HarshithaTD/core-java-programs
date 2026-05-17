package com.basics;

public class HollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==rows||i==1||j==1||j==rows) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("1-------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==rows||i==1||j==1||j==rows||i==j) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("2-------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==rows||i==1||j==1||j==rows||i==j||rows+1-i==j ) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("3-------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==rows||i==1||j==1||j==rows||i==j||rows+1-i==j ||i==rows/2+1 ) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("4-------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==rows||i==1||j==1||j==rows||i==j||rows+1-i==j ||i==rows/2+1 ||j==rows/2+1 ) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("5-------------------------------------------------------------");
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=6;j++) {
				if((i==1&& j%3==0)||(i==0 && j%3!=0)|| j==i-2 || j==8-i ) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("5-------------------------------------------------------------");
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=6;j++) {
				if((i==1&& j%3==0)||(i==0 && j%3!=0)|| j==i-2 || j==8-i ) {
					System.out.print("*"+ " ");
				}
				else if (i==2 && j==2) {
					System.out.print("R"+" ");
				}
				else if (i==2 && j==3) {
					System.out.print("C"+" ");
				}
				else if (i==2 && j==4) {
					System.out.print("B"+" ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		for(int i=5-1;i>=0;i--) {
			for(int j=0;j<=6;j++) {
				if((i==1&& j%3==0)||(i==0 && j%3!=0)|| j==i-2 || j==8-i ) {
					System.out.print("*"+ " ");
				}
				else if (i==2 && j==2) {
					System.out.print("R"+" ");
				}
				else if (i==2 && j==3) {
					System.out.print("C"+" ");
				}
				else if (i==2 && j==4) {
					System.out.print("B"+" ");
				}
				else {
					System.out.print(" "+ " ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("6-------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if((i==rows||i==1||j==1||j==rows)||( i==rows/2+1 && j<=rows/2+1)|| ( j==rows/2+1 && i<=rows/2+1)) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		System.out.println("7-------------------------------------------------------------");
		
	}

}
