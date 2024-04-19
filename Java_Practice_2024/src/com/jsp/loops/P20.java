package com.jsp.loops;

public class P20 {

	public static void main(String[] args) {
		int num=4660;
		if(num!=0) {
			if(num%7==0) {
				System.out.println("the given number "+num+" is divisable by 7");
			}else {
				System.out.println("the given number "+num+" is not divisable by 7");
			}
		}else {
			System.out.println("please enter a number greater than 0");
		}
	}

}
