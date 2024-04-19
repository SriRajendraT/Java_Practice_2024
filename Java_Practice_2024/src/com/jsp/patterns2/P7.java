package com.jsp.patterns2;

public class P7 {

	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
