package com.jsp.patterns4;

public class P10 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row <= num; row++) {
			char ch = 'e';
			for (int col = 1; col < row; col++) {
				System.out.print("  ");
			}
			for (int col = row; col <= num; col++) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
	}

}
