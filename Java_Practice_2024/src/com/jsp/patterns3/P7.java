package com.jsp.patterns3;

public class P7 {

	public static void main(String[] args) {
		int num = 5, n = 1;
		char ch = 'a';
		for (int row = 1; row < num; row++) {
			for (int col = 1; col < num; col++) {
				if (col % 2 == 0) {
					System.out.print(ch + " ");
					ch += 3;
				} else {
					System.out.print(n + " ");
					n += 3;
				}
			}
			System.out.println();
		}
	}

}
