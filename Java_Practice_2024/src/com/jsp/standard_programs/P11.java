package com.jsp.standard_programs;

public class P11 {

	public static void main(String[] args) {
		int n = 2, x = 5;
		long res = power(n, x);
		System.out.println(res);
	}

	public static long power(int base, int exponent) {
		long result = 1;

		if (exponent > 0) {
			for (int i = 0; i < exponent; i++) {
				result *= base;
			}
		} else if (exponent < 0) {
			for (int i = 0; i > exponent; i--) {
				result /= base;
			}
		}

		return result;
	}
}
