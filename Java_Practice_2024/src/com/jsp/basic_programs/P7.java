package com.jsp.basic_programs;

public class P7 {

	public static void main(String[] args) {
		int num1=-11,num2=2,num3=3;
		int min=num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3);
		System.out.println("from the given number "+num1+", "+num2+" and "+num3+" the smallest is "+min);
	}

}
