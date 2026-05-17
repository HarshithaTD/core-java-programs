package com.basics;

public class DeseriumNumber {
	
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
				digit--;
			}
			return res;
		}
		public static void main(String[] args) {
			int num=153;
			int res=Arm(num);
			if(num==res) {
				System.out.println(" Its Deserium Number");
			}
			else {
				System.out.println("not Deserium Number");
			}
		}

	

}
