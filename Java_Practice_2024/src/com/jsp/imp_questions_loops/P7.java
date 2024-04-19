package com.jsp.imp_questions_loops;

public class P7 {

	public static void main(String[] args) {
		int m = 11, n = 20;
		for (int i = m; i <= n; i++) {
			if (!containsSeven(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean containsSeven(int num) {
		while (num != 0) {
			if (num % 10 == 7) {
				return true;
			}
			num /= 10;
		}
		return false;
	}

}
