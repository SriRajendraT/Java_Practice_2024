package com.jsp.imp_questions_loops;

public class P5 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = sumation(num);
		if (checkEven(sum)) {
			System.out.println("the sum of digit from given number " + num + " is " + sum + " and it is Even");
		} else {
			System.out.println("the sum of digit from given number " + num + " is " + sum + " and it is Odd");
		}
	}

	public static int sumation(int num) {
		int  rem = 0, sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		return sum;
	}

	public static boolean checkEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
