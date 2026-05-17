package com.basics;

public class IntegerNumber {
	public static int sumdigit(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=99;
		int gnum=num+1;
		while(sumdigit(num)*2!=sumdigit(gnum)) {
			gnum++;
		}
			System.out.println(gnum);
		
	}
}
