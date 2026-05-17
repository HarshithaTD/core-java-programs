package com.strings;

public class Com_charArray {
	public static char [] conv_chararray(String s) {
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
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
	public static void main(String[] args) {
		String s1="pentagonespace";
		String s2="pentagonespace";
		char[] res1=conv_chararray(s1);
		char[] res2=conv_chararray(s2);
		System.out.println(check_arrays(res1,res2));
	}

}
