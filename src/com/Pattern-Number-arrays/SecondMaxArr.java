package com.basics;

public class SecondMaxArr {

	public static void main(String[] args) {
		int []arr= {45,18,17,63,7,39};
		int max1=arr[0], max2=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
			}
			
		}
		System.out.println(max2);
	}
	

}
