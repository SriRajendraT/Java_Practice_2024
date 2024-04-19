package com.jsp.patterns4;

public class P5 {

	public static void main(String[] args) {
		int num = 5;
		char ch = 'a';
		for (int row = 1; row < num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
