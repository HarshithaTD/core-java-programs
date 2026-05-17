package com.basics1;

public class Max_sum_subarr_sizK {

	public static void main(String[] args) {
		int [] arr= {21,-5,-22,5,9,-34};
		int max_sum=0;					//int max_sum=Integer.MIN.VALUE
		int k=2;
		int s=0,e=k-1;
		for(int i=0;i<k;i++) {
			max_sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				int len=0;
				for(int x=i;x<=j;x++) {
					sum+=arr[x];
					len++;
				}
				if(sum>=max_sum && len==k) {
					max_sum=sum;
					s=i;
					e=j;
				}
			}
		}
		System.out.println(max_sum);
		for(int i=s;i<=e;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
