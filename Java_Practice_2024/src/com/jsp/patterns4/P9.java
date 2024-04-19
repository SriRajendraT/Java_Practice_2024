package com.jsp.patterns4;

public class P9 {

	public static void main(String[] args) {
		int num = 5, n = 1;
		char ch = 'a';
		for (int row = 1; row < num; row++) {
			for (int col = 1; col <= row; col++) {
				if (col % 2 == 0) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print(n + " ");
					n++;
				}
			}
			System.out.println();
		}
	}

}
