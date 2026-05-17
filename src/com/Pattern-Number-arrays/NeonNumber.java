package com.basics;

public class NeonNumber {
	public static int sqsumdigit(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=9;
       int sq=(int)Math.pow(num, 2);
       int res=sqsumdigit(sq);
       if(num==res) {
    	   System.out.println("its neon number");
       }
       else {
    	   System.out.println("its not neon number");
       }
	}

}
