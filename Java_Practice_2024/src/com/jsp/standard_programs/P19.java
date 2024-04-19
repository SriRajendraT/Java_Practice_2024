package com.jsp.standard_programs;

public class P19 {

	public static void main(String[] args) {
		int m = 1, n = 1412;
		for (int i = m; i <= n; i++) {
			if (addNum(i) == multiNum(i)) {
				System.out.println(i);
			}
		}
	}

	public static int addNum(int num) {
		int sum = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}

	public static int multiNum(int num) {
		int product = 1, rem = 0;
		while (num != 0) {
			rem = num % 10;
			product *= rem;
			num /= 10;
		}
		return product;
	}
}
