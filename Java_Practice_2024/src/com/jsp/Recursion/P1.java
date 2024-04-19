package com.jsp.Recursion;

public class P1 {

	public static void main(String[] args) {
		System.out.println("Natural Number from 1 to 10");
		naturalNum(1);
	}

	public static void naturalNum(int num) {
		if(num<=10) {
			System.out.println(num);
			naturalNum(num+1);
		}
	}
}
