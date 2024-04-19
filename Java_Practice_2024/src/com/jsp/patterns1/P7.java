package com.jsp.patterns1;

public class P7 {

	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == col) {
					System.out.print("a ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
