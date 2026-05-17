package com.basics;

import java.util.Arrays;

public class RotateArrClockwise {
	public class Rotate_Arr_in_Clockwise {
		
		public static void rotat(int []arr) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []arr= {10,20,30,40,50,60};
			for(int i=1;i<=4200;i++) {
				rotat(arr);
			}
			System.out.println(Arrays.toString(arr));
		
		}

	}

}
