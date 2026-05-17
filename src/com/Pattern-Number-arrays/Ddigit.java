package com.basics;

public class Ddigit {
//	public static int count_digit(int num) {
//		int digit=0;
//		while(num!=0) {
//			num=num/10;
//			digit++;
//		}
//		return digit;
//	}
	public static int sumdigit(int num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=res+rem;
			num=num/10;
		}
		return res;
	}
	public static void main(String[] args) {
		int k=2,s=9;
//		int num=1;
//		while(sumdigit(num)!=s||count_digit(num)!=k) {
//			num++;
//		}
//		System.out.println(num);
		
	
		
		int q= (int)Math.pow(10, k-1);
		for(int i=q; i<=(q*9.9);i++) {
			if(sumdigit(i)==s) {
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
