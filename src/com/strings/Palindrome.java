package com.strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+= s.charAt(i);
		}
		
		if(s.equals(res)) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not");
		}
	}

}
