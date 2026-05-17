package com.strings;

public class Conv_toLower {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PentAgOn sPace";
		String res=conv_lower(s);
		System.out.println(res);
	}


}
