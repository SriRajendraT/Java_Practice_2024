package com.jsp.patterns2;

public class P4 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row <= num; row++) {
			for (char ch = 'e'; ch >= 'a'; ch--) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

}
