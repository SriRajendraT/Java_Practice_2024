package com.jsp.loops;

public class P12 {

	public static void main(String[] args) {
		int m=2,n=10,sum=0;
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println("the sum of even values between "+m+" and "+n+" are "+sum);
			}
		}
	}

}
