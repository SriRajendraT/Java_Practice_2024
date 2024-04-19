package com.jsp.imp_questions_loops;

public class P8 {

	public static void main(String[] args) {
		int m = 1, n = 60;
		int fives = loopNum(m, n);
		System.out.println("the total count of '5's between " + m + " and " + n + " are " + fives);
	}

	public static int loopNum(int m, int n) {
		int count = 0;
		for (int i = m; i <= n; i++) {
			if (countFives(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean countFives(int num) {
		while (num != 0) {
			if (num % 10 == 5) {
				return true;
			}
			num /= 10;
		}
		return false;
	}
}
