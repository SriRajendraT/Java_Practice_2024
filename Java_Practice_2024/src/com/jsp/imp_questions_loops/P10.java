package com.jsp.imp_questions_loops;

public class P10 {

	public static void main(String[] args) {
//		int m = 1, n = 40;
//		int sixes=loopNum(m, n);
//		System.out.println(sixes);
		int start = 1; // Starting number
		int end = 100; // Ending number

		int countOfNumbersWithSix = 0;

		for (int i = start; i <= end; i++) {
			int number = i;
			boolean foundSix = false;
			while (number != 0) {
				if (number % 10 == 6) {
					countOfNumbersWithSix++;
					foundSix = true;
					break; // Exit the loop once 6 is found in the number
				}
				number /= 10;
			}
			if (foundSix) {
				System.out.println("The number is "+i); // Print the number containing 6
			}
		}

		System.out.println("Count of numbers with 6: " + countOfNumbersWithSix);
	}

//	public static int loopNum(int m, int n) {
//		int count = 0;
//		for (int i = m; i <= n; i++) {
//			if (countSix(i)) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static boolean countSix(int num) {
//		while (num != 0) {
//			if (num % 10 == 6) {
//				return true;
//			}
//			num /= 10;
//		}
//		return false;
//	}
}
