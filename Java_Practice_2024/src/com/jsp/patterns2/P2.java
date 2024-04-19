package com.jsp.patterns2;

public class P2 {

	public static void main(String[] args) {
		int num = 4, n = 8;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == col || row + col == num + 1) {
					System.out.print(n + " ");
					n--;
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
