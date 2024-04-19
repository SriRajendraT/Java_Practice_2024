package com.jsp.patterns3;

public class P2 {

	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (col % 2 == 0) {
					System.out.print("a ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
