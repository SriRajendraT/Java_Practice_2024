package com.jsp.Recursion;

public class P6 {

	public static void main(String[] args) {
		int num=4;
		if(isPrime(num, num/2)) {
			System.out.println("the given number "+num+" is prime");
		}else {
			System.out.println("the given number "+num+" is not prime");
		}
	}
	 public static boolean isPrime(int num, int i) {
	        if (num <= 2) {
	            return (num == 2) ? true : false;
	        }
	        if (i == 1) {
	            return true;
	        }
	        if (num % i == 0) {
	            return false;
	        }
	        return isPrime(num, i - 1);
	    }
}
