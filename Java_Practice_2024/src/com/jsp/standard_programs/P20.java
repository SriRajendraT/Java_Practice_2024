package com.jsp.standard_programs;

public class P20 {

	public static void main(String[] args) {
		int m=1,n=10000;
		for(int i=m;i<=n;i++) {
			if(checkPerfectNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean checkPerfectNumber(int num) {
		if (num <= 1) {
			return false;
		}

		int sum = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i * i != num) {
					sum += num / i;
				}
			}
		}

		return sum == num;
	}
}
