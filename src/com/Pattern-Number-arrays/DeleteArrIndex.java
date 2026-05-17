package com.basics;

import java.util.Arrays;

public class DeleteArrIndex {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60,70};
		int ind=4;
		int []res=new int [arr.length-1];
		for(int i=0;i<ind;i++) {
			res[i]=arr[i];
		}
		for(int i=ind+1;i<arr.length;i++) {
			res[i-1]=arr[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
