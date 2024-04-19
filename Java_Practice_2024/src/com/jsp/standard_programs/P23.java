package com.jsp.standard_programs;

public class P23 {

	public static void main(String[] args) {
		int m = 1, n = 10;
		for (int i = m; i <= n; i++) {
			if (checkPrimeNum(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean checkPrimeNum(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		return !(count > 0);
	}

}
