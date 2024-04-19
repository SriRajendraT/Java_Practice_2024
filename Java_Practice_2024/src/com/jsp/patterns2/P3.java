package com.jsp.patterns2;

public class P3 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row <= num; row++) {
			for (int col = num; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
