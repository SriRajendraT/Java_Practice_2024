package com.jsp.if_else;

public class P11 {

	public static void main(String[] args) {
		int num1 = 11, num2 = 2, num3 = 13;
		int middleDigit = 0;
		if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
			middleDigit = num1;
		} else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
			middleDigit = num2;
		} else {
			middleDigit = num3;
		}
		System.out.println("from the given numbers " + 
		num1 + ", " + num2 + " and " + num3 + 
		" middle number is " + middleDigit);
	}

}
