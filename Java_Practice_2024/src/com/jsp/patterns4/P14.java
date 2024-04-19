package com.jsp.patterns4;

public class P14 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row < num; row++) {
		/*	for (int col = 1; col <= 8; col++) {
				if (row == 1 && col >= num-3 && col <= num+2) {
					System.out.print("_ ");
				} else if (row == 2 && col >= num-2 && col <= num+1) {
					System.out.print("_ ");
				} else if (row == 3 && col >= num-1 && col <= num) {
					System.out.print("_ ");
				} else {
					System.out.print("* ");
				}
			}*/
			 for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			for (int col = 1; col <= ((num-1) - row) * 2; col++) {
				System.out.print("_ ");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			} 
			System.out.println();
		}
	}

}
