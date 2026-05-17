package com.basics;

public class Print_PrimeNumber {
	public static int count_prime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		for(int k=1;k<=10000;k++) {
		int num=k;
		int count=count_prime(num);
		if(count==2) {
			System.out.println(num);
		}
	}
	}
}
