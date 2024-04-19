package com.jsp.Recursion;

public class P4 {

	public static void main(String[] args) {
		int num = 1;
		int res = factorial(num);
		System.out.println("the factorial of " + num + " is " + res);
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
