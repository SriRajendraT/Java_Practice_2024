package com.jsp.loops;

public class P14 {

	public static void main(String[] args) {
		int m=1,n=10,sum=0;
		for(int i=m;i<=n;i++) {
			if(i%2!=0) {
				sum+=i;
				System.out.println("the sum of odd numbers between "+m+" and "+n+" is "+sum);
			}
		}
	}

}
