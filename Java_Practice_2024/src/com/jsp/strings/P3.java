package com.jsp.strings;

public class P3 {

	public static void main(String[] args) {
		String str = "Rajendra";
		System.out.println("actual String : "+str);
		String revStr=revString(str.toUpperCase());
		System.out.println("Reversed String : "+revStr.toUpperCase());
	}

	public static String revString(String str) {
		char[] ch = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		
		return new String(ch);
	}
}
