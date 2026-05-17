package com.basics;

public class LCM {

	public static void main(String[] args) {
	
				int a=7, b=5;
				int max=(a>b)?a:b;
				for(int i=max;i<=(a*b);i++)
				{
					if(i%a==0 && i%b==0) {
						System.out.println(i);
						break;
						
					}
				}
				
			}

	

	}


