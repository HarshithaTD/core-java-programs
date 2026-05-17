package com.basics;


public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Natural Numbers-----------------------------------------------------------------------");

		int n=100;
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		System.out.println(" Even Number-----------------------------------------------------------------------");
		 n=100;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		System.out.println("Odd Number----------------------------------------------------------------------");
		
		 n=100;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
		System.out.println("Both Even and Odd number-----------------------------------------------------------------------");
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				}
			else {
				System.out.println(i);
			}
		}
		System.out.println("-----same question --------------------------");
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			
				System.out.println(i+1);
			}
		}
		
		System.out.println("-----same question --------------------------");
		
		for(int i=1;i<=n;i+=2) {
				System.out.println(i+" "+(i+1));
			
			}
		
		System.out.println("---Multiplication tables------------------------------------------------");
		
	n=2;
	for(int i=1;i<=10;i++) {
		System.out.println(n+" * "+i+" = "+n*i);
	}
	System.out.println("-----------Factors----------------------------------------");
	
	n=24;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
		System.out.print(i+" ");
		}
	}
	}
}
