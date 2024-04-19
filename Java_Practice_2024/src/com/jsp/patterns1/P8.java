package com.jsp.patterns1;

public class P8 {

	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row + col == num + 1) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
