package com.jsp.patterns3;

public class P4 {

	public static void main(String[] args) {
		int num = 5, n = 1;
		char ch = 'a';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == num && col == 1) {
					ch = 'i';
				}
				if (row == num && col == 3) {
					System.out.print("+ ");
				} else if (col % 2 != 0) {
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
