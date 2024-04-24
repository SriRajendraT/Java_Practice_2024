package com.jsp.strings;

public class P8 {

	public static void main(String[] args) {
		String str="rajendra";
		countChar(str);
	}
	public static void countChar(String str) {
		int[] count=new int[256];
		for(char ch:str.toCharArray()) {
			count[ch]++;
		}
		
		System.out.println("Character Count : ");
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.println("'" + (char) i + "': " + count[i] + " times");
			}
		}
	}
}
