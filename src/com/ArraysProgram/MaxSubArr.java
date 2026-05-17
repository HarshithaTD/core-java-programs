package com.basics1;

public class MaxSubArr {

	public static void main(String[] args) {
		int [] arr= {-10,-20,-30,-40,-50};
		int max_sum=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					
					sum+=arr[k];
				}
				if(sum>max_sum) {
					max_sum=sum;
				}
			}
		}
		System.out.println(max_sum);
	}

}
