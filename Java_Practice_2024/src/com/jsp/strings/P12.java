package com.jsp.strings;

public class P12 {

	public static void main(String[] args) {
		String str = "10123456raj";
		int count = countDigits(str);
		System.out.println("from the given string " + str + " number for digits present is " + count);
	}

	public static int countDigits(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		return count;
	}
}
