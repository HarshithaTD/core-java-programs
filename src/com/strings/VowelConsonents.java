package com.strings;

public class VowelConsonents {

	public static void main(String[] args) {
		String s= "P e n t 1$%^ag on";
		int v_count=0;
		int c_count=0;
		int s_count=0;
		int sp_count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>=65&& ch<=90)||(ch>=97 && ch<=122)||ch==32) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v_count++;
			}
			else if(ch==' '
					) {
				s_count++;
			}
			else {
				c_count++;
			}
		
		}
		else {
			sp_count++;
		}}
		System.out.println(v_count);
		System.out.println(c_count);
		System.out.println(s_count);
		System.out.println(sp_count);
	}

}
