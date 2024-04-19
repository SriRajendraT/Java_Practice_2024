package com.jsp.loops;

public class P21 {

	public static void main(String[] args) {
		int m=1,n=100,count=0;
		for(int i=m;i<=n;i++) {
			if(i%7==0) {
				count++;
			}
		}
		System.out.println("the no of numbers divisible by 7 present between "+m+" and "+n+" are "+count);
	}

}
