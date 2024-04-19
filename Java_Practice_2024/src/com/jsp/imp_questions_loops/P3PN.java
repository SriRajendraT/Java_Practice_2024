package com.jsp.imp_questions_loops;

public class P3PN {

	public static void main(String[] args) {
		int num = 12343210;
		if (checkPalindrome(num)) {
			System.out.println("the given number " + num + " is palindrome");
		} else {
			System.out.println("the given number " + num + " is not palindrome");
		}
	}

	public static boolean checkPalindrome(int num) {
		int temp = num, rem = 0, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (temp == rev) {
			return true;
		} else {
			return false;
		}
	}
}
