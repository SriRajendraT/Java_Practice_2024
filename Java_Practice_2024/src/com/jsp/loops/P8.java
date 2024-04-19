package com.jsp.loops;

public class P8 {

	public static void main(String[] args) {
		int num = 26;
		if (num >= 1 && num <= 26) {
			char ch = 'A';
			for (int i = 2; i <= num; i++) {
				ch++;
			}
			System.out.println(ch);
		} else {
			System.out.println("there are only 26 alphabets");
		}
	}
}