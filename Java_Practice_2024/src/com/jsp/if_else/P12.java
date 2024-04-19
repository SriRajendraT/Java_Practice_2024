package com.jsp.if_else;

public class P12 {

	public static void main(String[] args) {
		int num1 = 11, num2 = 2, num3 = 13;
		if(num1<=num2 && num1<=num3) {
			if(num2<=num3) {
				System.out.println("Ascending order of given numbers is "+num1+", "+num2+", "+num3); 
			}else {
				System.out.println("Ascending order of given numbers is "+num1+", "+num3+", "+num2);
			}
		}else if(num2<=num1 && num2<=num3) {
			if(num1<=num3) {
				System.out.println("Ascending order of given numbers is "+num2+", "+num1+", "+num3);
			}else {
				System.out.println("Ascending order of given numbers is "+num2+", "+num3+", "+num1);
			}
		}else {
			if(num1<=num2) {
				System.out.println("Ascending order of given numbers is "+num3+", "+num1+", "+num2);
			}else {
				System.out.println("Ascending order of given numbers is "+num3+", "+num2+", "+num1);
			}
		}
	}

}
