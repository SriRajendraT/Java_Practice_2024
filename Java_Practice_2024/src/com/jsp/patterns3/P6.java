package com.jsp.patterns3;

public class P6 {

	public static void main(String[] args) {
		int num = 5, n = 1;
		char ch = 'z';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col < num; col++) {
				if (n > 9) {
					n = 1;
				}
				if (col % 2 == 0) {
					System.out.print(ch + " ");
					ch--;
				} else {
					System.out.print(n + " ");
					n++;
				}
			}
			System.out.println();
		}
	}

}
