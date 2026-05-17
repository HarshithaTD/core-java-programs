package com.basics;

import java.util.Arrays;


public class ReverseArr {

	public static void main(String[] args) {
		int []arr={18,45,1,5,93,8};
		int []res=new int [arr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--) {
			res[k]=arr[i];
			k++;
		}
		System.out.println(Arrays.toString(res));
	System.out.println("------------or-------------");

	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	System.out.println(Arrays.toString(arr));
	}
}
