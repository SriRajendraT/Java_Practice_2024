package com.jsp.loops;

public class P22 {

	public static void main(String[] args) {
		int m = 1, n = 10, sum = 0;
		for (int i = m; i <= n; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out
				.println("the sum of total numbers between " + m + " and " + n + " which are divisible by 5 is " + sum);
	}

}
