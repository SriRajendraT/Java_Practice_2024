package com.jsp.if_else;

public class P5 {

	public static void main(String[] args) {
		int num=12301000;
		int rem=num%10;
		if(rem!=0) {
			System.out.println("from the given number "+num+" the last digit is "+rem);
		}else {
			System.out.println("from the given number "+num+" the last digit is 0");
		}
	}

}
