package com.jsp.Recursion;

public class P3 {

	public static void main(String[] args) {
		System.out.println("Printing from 4 to 1");
		fourToOne(4);

		System.out.println("Printing from 1 to 3");
		oneToThree(1);
	}

	public static void fourToOne(int num) {
		if (num >= 1) {
			System.out.println(num);
			fourToOne(num - 1);
		}
	}

	public static void oneToThree(int num) {
		if (num <= 3) {
			System.out.println(num);
			oneToThree(num + 1);
		}
	}

}
