package com.basics;

public class HCF {

	public static void main(String[] args) {
		int hcf=1;
		int a=8, b=12;
		int min=(a<b)?a:b;
		for(int i=1;i<min;i++)
		{
			if(a%i==0 && b%i==0) {
				hcf=i;
				
			}
		}
		System.out.println(hcf);
	}

}
