package com.jsp.loops;

public class P19 {

	public static void main(String[] args) {
		int num = 2, count = 10, multi = 0;
		for (int i = 1; i <= count; i++) {
			multi += num;
			System.out.println(num + " * " + i + " = " + (multi));
		}
	}

}
