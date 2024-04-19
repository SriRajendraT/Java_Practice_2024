package com.jsp.patterns4;

public class P13 {

	public static void main(String[] args) {
		int num = 5, n = 0, a = 1;
		for (int row = 1; row < num; row++) {
			n += a;
			for (int col = 1; col <= row; col++) {
				System.out.print(n + " ");
				n--;
			}
			a += 2;
			System.out.println();
		}
	}

}
