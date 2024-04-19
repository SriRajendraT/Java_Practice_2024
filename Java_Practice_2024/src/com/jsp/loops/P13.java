package com.jsp.loops;

public class P13 {

	public static void main(String[] args) {
		int m=1,n=10,product=1;
		if(m>=1 && n>=m) {
			for(int i=m;i<=n;i++) {
				if(i%2==0) {
					product*=i;
					System.out.println("the product of even numbers between "+m+" and "+n+" is "+product);
				}
			}
		}else {
			System.out.println("cannot multiply the value less than 0");
		}
	}

}
