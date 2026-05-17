package com.basics;

public class PrintPerfectNumber {

	public static void main(String[] args) {
		
		for(int k=1;k<=10000;k++) {
		int	num=k;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num);
		}
	}
	}
}
