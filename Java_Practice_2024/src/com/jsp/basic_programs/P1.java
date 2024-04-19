package com.jsp.basic_programs;

public class P1 {

	public static void main(String[] args) {
		int a =1,b=2;
		System.out.println("unchanged "+a);
		System.out.println("unchanged "+b);
		int c=a;
		System.out.println(c);
		a=b;
		System.out.println("changed "+a);
		b=c;
		System.out.println("changed "+b);
	}

}
