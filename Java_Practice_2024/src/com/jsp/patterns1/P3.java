package com.jsp.patterns1;

public class P3 {

	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == 3 && col == 1) {
					System.out.print("^ ");
				} else if (row == 4 && col == 4) {
					System.out.print("@ ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
