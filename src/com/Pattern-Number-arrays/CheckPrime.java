package com.basics;

public class CheckPrime {
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
		int num=3;
		int count=count_prime(num);
		if(count==2) {
			System.out.println("its prime number");
		}
		else {
			System.out.println("its not a prime number");
		}

	}

}
