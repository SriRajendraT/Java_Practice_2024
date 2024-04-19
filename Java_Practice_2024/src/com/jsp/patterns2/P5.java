package com.jsp.patterns2;

public class P5 {

	public static void main(String[] args) {
		int num = 4;
		char ch = '1';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == 3 && col == 2) {
					ch = '1';
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}

}
