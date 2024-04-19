package com.jsp.standard_programs;

public class P9 {

	public static void main(String[] args) {
		int num=5;
		long fact=factorial(num);
		System.out.println("the factorial of given number "+num+" is "+fact);
	}
	
	public static long factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}

}
