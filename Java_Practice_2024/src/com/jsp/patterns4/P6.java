package com.jsp.patterns4;

public class P6 {

	public static void main(String[] args) {
		int num = 5, n = 1;
		for (int row = 1; row < num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}
}
