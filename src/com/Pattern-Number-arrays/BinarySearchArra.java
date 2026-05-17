package com.basics;

public class BinarySearchArra {
	
		public static int b_Search(int arr[],int key) {
			int low=0;
			int high=arr.length-1;
			while(low<=high) {
				int mid=(low+high)/2;
				if(arr[mid]==key) {
					return mid;
				}
				else if(key>arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			return -1;
			
		}
		public static void main(String[] args) {
			int []arr= {93,63,48,18,10,7,3,1};
			int key=63;
			int ind=b_Search(arr ,key);
			System.out.println(ind);
		}


}
