package com.jsp.standard_programs;

public class P10 {

	public static void main(String[] args) {
		int num = 145;

		if (num == sumNum(num)) {
			System.out.println("the given number " + num + " is a Strong Number");
		} else {
			System.out.println("the given number " + num + " is not a Strong Number");
		}
	}

	public static long sumNum(int num) {
		int rem = 0;
		long fact = 1, sum = 0;
		while (num != 0) {
			rem = num % 10;
			fact = factorial(rem);
			sum = sum + fact;
			num /= 10;
		}
		return sum;
	}

	public static long factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
