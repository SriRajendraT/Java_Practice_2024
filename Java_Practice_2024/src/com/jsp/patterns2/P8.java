package com.jsp.patterns2;

public class P8 {

	public static void main(String[] args) {
		int num = 4;char ch='A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
