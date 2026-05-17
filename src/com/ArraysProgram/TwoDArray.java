package com.basics1;

import java.util.Arrays;

public class TwoDArray {
	public static void print_matrix(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][]arr=new int[3][3];
		int k=1;
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=k;
				k++;
			}
		}
		print_matrix(arr);
	}
}
