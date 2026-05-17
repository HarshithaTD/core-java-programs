package com.strings;

import java.util.Arrays;

public class Anagram {
	public static char [] conv_chararray(String s) {
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}
	public static String conv_lower(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				res+=(char)(ch+32);
			}
			else {
				res+=ch;
			}
		}
		return res;
	}
	public static boolean check_arrays(char []arr, char []res) {
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
	public static void c_sort(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr.length-1;k++) {
				if(arr[k]>arr[k+1]) {
					char temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Listen";
		String s2="silent";
		
		String a=conv_lower(s1);
		String b=conv_lower(s2);
		
		char [] arr1=conv_chararray(a);
		char [] arr2=conv_chararray(b);
		
		c_sort(arr1);
		c_sort(arr2);
		
		if(check_arrays(arr1,arr2)==true) {
			System.out.println("its anagram");
		}
		else {
			System.out.println("its not");
		}
	}

}
