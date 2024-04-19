package com.jsp.basic_programs;

public class P2 {

	public static void main(String[] args) {
		int a =1,b=2;
		System.out.println("unchanged "+a);
		System.out.println("unchanged "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("changed "+a);
		System.out.println("changed "+b);
	}

}
