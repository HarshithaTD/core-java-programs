package com.basics;

public class Relational {

	public static void main(String[] args) {
		int a=10, b=10 ,c=20;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a!=b);
		System.out.println(a!=c);
		System.out.println(a>b);
		System.out.println(b>c);
		System.out.println(c>a);
		System.out.println(a<c);
		System.out.println(a<=b);
		System.out.println(b>=c);
		System.out.println(b<c && c>a && a!=b);
		System.out.println(b<c && c>a || a!=b);
	}

}
