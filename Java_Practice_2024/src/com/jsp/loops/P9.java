package com.jsp.loops;

public class P9 {

	public static void main(String[] args) {
		int m=5,n=10,product=1;
		if(m >= 1 && n >= m) {
			for(int i=m;i<=n;i++) {
				product*=i;
//				System.out.println(i+" "+n+" "+product);
				System.out.println("the product of natural numbers between "+m+" and "+n+" is "+product);
			}
		}else {
			System.out.println("cannot multiply the value less than 0");
		}
	}

}
