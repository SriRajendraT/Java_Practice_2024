package com.jsp.basic_programs;

public class P6 {

	public static void main(String[] args) {
		int num1=11,num2=2,num3=3;
		int max=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("from the given number "+num1+", "+num2+" and "+num2+" the largest is "+max);
	}

}
