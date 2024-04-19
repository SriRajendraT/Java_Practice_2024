package com.jsp.patterns5;

public class P8 {

	public static void main(String[] args) {
		int num=5;
		for (int row = 1; row < num; row++) {
			for (int col = row; col < num; col++) {
				System.out.print("_ ");
			}
			for (char col = 'A'; col < 'A' + row; col++) {
				System.out.print(col + " ");
			}

			for (char col = (char) ('A' + row - 2); col >= 'A'; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		for(int row=num/2+1;row>=1;row--) {
			for (int col = row; col < num; col++) {
				System.out.print("_ ");
			}
			for (char col = 'A'; col < 'A' + row; col++) {
				System.out.print(col + " ");
			}

			for (char col = (char) ('A' + row - 2); col >= 'A'; col--) {
				System.out.print(col + " ");
			}
		System.out.println();
		}
	}

}
