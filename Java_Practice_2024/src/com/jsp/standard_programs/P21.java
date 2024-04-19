package com.jsp.standard_programs;

public class P21 {

	public static void main(String[] args) {
		int m = 1, n = 100;
		int square = 1, sqrt = 1;
		while (square <= n) {
			if (square >= m) {
				System.out.println(square);
			}
			sqrt++;
			square = sqrt * sqrt;
		}
	}

}
