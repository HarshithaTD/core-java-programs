package com.basics1;
import java.util.HashMap;
public class HMap {

	public static void main(String[] args) {
		int []arr= {2,3,6,3,4,2,5,3};
		HashMap<Integer,Integer> map=new HashMap<>();
		System.out.println(map);
		for(int key: arr) {
			if(map.containsKey(key)==true) {
				map.put(key, map.get(key)+1);
				
			}
			else { 
				map.put(key, 1);
			}
			}
			System.out.println(map);
			System.out.println("Duplicate ");
			for(int key:map.keySet()) {
				if(map.get(key)>1) {
					System.out.println(key);
				}
			}
			System.out.println("Non-dup");
			for(int key:map.keySet()) {
				if(map.get(key)==1) {
					System.out.println(key);
				}
			}
			System.out.println("Remove-dup");
			for(int key:map.keySet()) {
					System.out.println(key);
				}
		}
	}


