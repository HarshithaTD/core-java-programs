package com.basics;

public class deseriumpattern {
		
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
				int rows=5;
				int k=1;
				for(int i=1;i<=rows;i++) {
					for(int j=1;j<=i;) {
						if(k==Arm(k)) {
						System.out.print(k+" ");
						j++;
						}
						k++;
				}
				System.out.println();
			
			}

		

	}


}
