package com.jsp.patterns2;

public class P1 {

	public static void main(String[] args) {
		int num = 5;
		char ch = 'a';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == col || col + row == num + 1) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
