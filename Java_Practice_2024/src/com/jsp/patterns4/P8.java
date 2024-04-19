package com.jsp.patterns4;

public class P8 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row < num; row++) {
			char ch = 'a';
			for (int col = 1; col <= row; col++) {
				if (row % 2 == 0) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.println();
		}
	}

}
