package com.strings;

public class Substring1 {
	public static String rev(String s) {
		String ans="";
		for(int i=s.length()-1;i>=0;i--) {
			ans+=s.charAt(i);
			
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String res="";
			
				for(int k=i;k<=j;k++) {
					res+=s.charAt(k);
				}
				if(res.equals(rev(res))) {
					System.out.println(res);
				}
	}

}
	}
}
