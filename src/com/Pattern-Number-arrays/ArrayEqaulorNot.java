package com.basics;

public class ArrayEqaulorNot {
	public static boolean check_arrays(int []arr,int []res) {
		if(arr.length != res.length){
			return false;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=res[i]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		int []res= {10,20,30,40,50,60};
		System.out.println(check_arrays(arr,res));
	}

}
