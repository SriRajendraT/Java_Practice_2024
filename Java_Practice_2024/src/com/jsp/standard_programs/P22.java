package com.jsp.standard_programs;

public class P22 {

	public static void main(String[] args) {
		int m = 1, n = 200;
		for (int i = m; i <= n; i++) {
			if (i == checkStrongNum(i)) {
				System.out.println(i);
			}
		}
	}

	public static int checkStrongNum(int num) {
		int rem = 0, fact = 1, sum = 0;
		while (num != 0) {
			rem = num % 10;
			fact = factorial(rem);
			sum += fact;
			num /= 10;
		}
		return sum;
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
