package com.strings;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		
		int [] arr= {1,20,3,40,5};
		
		int max=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		int secmin=Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		
		int e_count=0;
		int o_count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec && arr[i]!=max) {
				sec=arr[i];
			}
			
			if(arr[i]%2==0) {
				e_count++;
				
			}
			else {
				o_count++;
			}
			
			if(arr[i]<min) {
				secmin=min;
				min=arr[i];
			}
			else if(arr[i]<secmin && arr[i]!=min) {
				secmin=arr[i];
			}
			
			
			sum=sum+arr[i];
		}
		
		System.out.println("max: "+ max);
		System.out.println("secmax "+sec);
		System.out.println("secmin "+secmin);
		System.out.println("min: "+ min);
		System.out.println("sum: "+ sum);
		System.out.println("even number count "+e_count );
		System.out.println("odd number count "+o_count );
	}

}
