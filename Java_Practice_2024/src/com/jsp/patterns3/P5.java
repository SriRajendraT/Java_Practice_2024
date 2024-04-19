package com.jsp.patterns3;

public class P5 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row <= num; row++) {
			char ch = 'a';
			if (row % 2 != 0) {
				for (int col = 1; col <= num; col++) {
					if (row == 3) {
						System.out.print("+ ");
					} else {
						System.out.print(col + " ");
					}
				}
			} else {
				for (int col = 1; col <= num; col++, ch++) {
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
	}

}
