package com.practice.dsa;

public class Test {

	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5}; // 1,2,3,4,5
		try {
			String s1 = "";
			for(int i =0; i<array1.length; i=i+1) {
				s1 = s1+"|"+array1[i];
			}
			s1 = s1.substring(1);
			System.out.println(s1);
			
			String [] s2 = s1.split("\\d+");
			for(int i = 0; i<s2.length; i++) {
//				System.out.println(s2[6]);
				System.out.println(s2[i]);
			}
			for(String s: s2) {
				//System.out.println(s);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
