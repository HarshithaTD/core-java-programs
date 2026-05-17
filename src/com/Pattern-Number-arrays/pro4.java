package com.basics;

public class pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("1------------------------------------------------------------");

		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=rows-3;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=rows-3;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("2------------------------------------------------------------");

		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows+1-i;j<=rows;j++) {
				System.out.print(j+" ");
			}
			for(int j=rows-1;j>=rows+1-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows+1-i;j<=rows;j++) {
				System.out.print(j+" ");
			}
			for(int j=rows-1;j>=rows+1-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("3------------------------------------------------------------");
		
		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		System.out.println("4------------------------------------------------------------");
		
		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=rows-3;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=rows-3;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		System.out.println("5------------------------------------------------------------");
		
		for(int i=1; i<=rows ;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows;j>=rows+1-i;j--) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=rows+2-i;j<=rows;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		for (int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows;j>=rows+1-i;j--) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=rows+2-i;j<=rows;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
	}

}
