package com.basics1;

public class Count_sumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,10,-8,9,-3,-2,6,-6};
		int count=0;
		int s=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					
					sum+=arr[k];
				}
				if(sum==s) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
