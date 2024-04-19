package com.jsp.patterns4;

public class P3 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row < num; row++) {
			for (int col = row; col < num; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
