package com.jsp.patterns3;

public class P8 {

	public static void main(String[] args) {
		int num = 5, n = 1;
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == 3 || col == 3) {
					System.out.print("# ");
				} else if (col % 2 != 0) {
					System.out.print(n + " ");
					n++;
				} else {
					System.out.print(ch + " ");
					ch++;
				}

			}
			System.out.println();
		}
	}

}
