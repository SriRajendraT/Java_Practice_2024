package com.jsp.patterns2;

public class P10 {

	public static void main(String[] args) {
		int num = 4, n = 1;
		char ch = 'a';
		for (int row = 1; row <= num; row++) {
			if (row % 2 != 0) {
				for (int col = 1; col <= num; col++) {
					System.out.print(n + " ");
					n++;
				}
			} else {
				for (int col = 1; col <= num; col++) {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}

}
