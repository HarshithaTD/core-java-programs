package com.basics;

import java.util.Arrays;

public class RotateArrAnticlockwise {

	public static void main(String[] args) {
		int []arr= {20,40,60,80,30,70};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
