package com.jsp.loops;

import java.util.Scanner;

public class P25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int dividend = scanner.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = scanner.nextInt();

		int remainder = findRemainder(dividend, divisor);
		System.out.println("Remainder: " + remainder);

		scanner.close();
	}

	public static int findRemainder(int dividend, int divisor) {
		if (divisor == 0) {
			System.out.println("Cannot divide by zero.");
		}

		boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		while (dividend >= divisor) {
			dividend -= divisor;
		}

		return isNegative ? -dividend : dividend;
	}
}
