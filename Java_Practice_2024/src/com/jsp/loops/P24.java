package com.jsp.loops;

import java.util.Scanner;

public class P24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int dividend = scanner.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = scanner.nextInt();

		int quotient = divide(dividend, divisor);
		System.out.println("Quotient: " + quotient);

		scanner.close();
	}

	public static int divide(int dividend, int divisor) {
		if (divisor == 0) {
			System.out.println("Cannot divide by zero.");
		}
		int quotient = 0;
		boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		while (dividend >= divisor) {
			dividend -= divisor;
			quotient++;
		}
		return isNegative ? -quotient : quotient;
	}
}
