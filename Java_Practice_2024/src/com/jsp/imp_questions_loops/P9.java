package com.jsp.imp_questions_loops;

public class P9 {

	public static void main(String[] args) {
		int m = 1, n = 40;
		int threes = loopNum(m, n);
		System.out.println("the total count of '3's between " + m + " and " + n + " are " + threes);
	}

	public static int loopNum(int m, int n) {
		int count = 0;
		for (int i = m; i <= n; i++) {
			if (countThree(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean countThree(int num) {
		while (num != 0) {
			if (num % 10 == 3) {
				return true;
			}
			num /= 10;
		}
		return false;
	}
}
