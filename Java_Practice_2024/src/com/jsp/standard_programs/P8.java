package com.jsp.standard_programs;

public class P8 {

	public static void main(String[] args) {
		int num = 5;
		if (checkPerfectSquare(num)) {
			System.out.println("the given " + num + " is Perfect Square");
		} else {
			System.out.println("the given " + num + " is not a Perfect Square");
		}
	}

	public static boolean checkPerfectSquare(int num) {
		if (num <= 0)
			return false;
		int sqrt = 0;
		while (sqrt * sqrt <= num) {
			if (sqrt * sqrt == num) {
				return true;
			}
			sqrt++;
		}
		return false;
	}
}
