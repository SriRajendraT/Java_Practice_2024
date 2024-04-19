package com.jsp.patterns4;

public class P11 {

	public static void main(String[] args) {
		int num = 5;
		for (int row = 1; row <= num; row++) {
			char ch = 'a';
			int n = 5;
			if (row % 2 == 0) {
				for (int col = row; col <= num; col++) {
					System.out.print(ch + " ");
					ch++;
				}
			} else {
				for (int col = row; col <= num; col++) {
					System.out.print(n + " ");
					n--;
				}
			}
			System.out.println();
		}
	}

}
