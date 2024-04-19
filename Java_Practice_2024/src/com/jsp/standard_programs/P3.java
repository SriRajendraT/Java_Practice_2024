package com.jsp.standard_programs;

public class P3 {

	public static void main(String[] args) {
		int num = 122;
		if (checkPalindrome(num)) {
			System.out.println("the given number " + num + " is a Palindrome");
		} else {
			System.out.println("the given number " + num + " is not a Palindrome");
		}
	}

	public static boolean checkPalindrome(int num) {
		int rem = 0, rev = 0, temp = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (temp == rev)
			return true;
		else
			return false;
	}

}
