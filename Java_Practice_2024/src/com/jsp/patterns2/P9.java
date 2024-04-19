package com.jsp.patterns2;

public class P9 {

	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			char ch = 'A';
			if (row % 2 == 0) {
				for (int col = 1; col <= num; col++) {
					System.out.print(col + " ");
				}
			} else {
				for (int col = 1; col <= num; col++) {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}

}
