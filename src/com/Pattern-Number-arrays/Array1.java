package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the len of array");
		int n=s.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the value of n");
		//System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			}
		System.out.println(Arrays.toString(arr));
	}

}
