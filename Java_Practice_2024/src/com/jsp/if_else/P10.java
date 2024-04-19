package com.jsp.if_else;

public class P10 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = -5;
		int min = num1;
		if (num2 < min) {
			min = num2;
		}
		if (num3 < min) {
			min = num3;
		}
		if (num4 < min) {
			min = num4;
		}
		if (num5 < min) {
			min = num5;
		}
		System.out.println("from the given number " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " and " + num5
				+ " the smallest is " + min);
	}

}
