package com.basics;

public class HappyNumber {
	public static int sqsumdigit(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=7;
		int res=sqsumdigit(num);
		while(res!=1&& res!=4) {
			res=sqsumdigit(res);
		}
		if(res==1) {
			System.out.println("its Happy");
		}
		else {
			System.out.println("its not Happy");
		}
	}

}
