package com.jsp.Recursion;

public class P2 {

	public static void main(String[] args) {
		int num=10;
		naturalNum(num);
	}
	
	public static void naturalNum(int num) {
		if(num>=1) {
			System.out.println(num);
			naturalNum(num-1);
		}
	}

}
