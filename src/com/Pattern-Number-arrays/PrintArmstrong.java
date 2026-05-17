package com.basics;

public class PrintArmstrong {
	public static int count_digit(int num) {
		int digit=0;
		while(num!=0) {
			num=num/10;
			digit++;
		}
		return digit;
	}
	public static int Arm(int num) {
		int digit=count_digit(num);
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res= (int)Math.pow(rem, digit)+res;
			num=num/10;
		}
		return res;
	}
	public static void main(String[] args) {
		for(int k=1;k<=10000;k++) {
		int num=k;
		int res=Arm(num);
		if(num==res) {
			System.out.println(num);
		}
		}
		
	}

}
