package com.basics;

import java.util.Arrays;

public class Rotat_N_numArr {
	
public static void rotat(int []arr) {
	int temp=arr[0];
	for(int i=1;i<arr.length;i++) {
		arr[i-1]=arr[i];
	}
	arr[arr.length-1]=temp;
	System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50,60	};
		for(int i=1;i<=4203;i++) {
			rotat(arr);
		}
		System.out.println(Arrays.toString(arr));
	}

}
