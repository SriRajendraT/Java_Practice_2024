package com.jsp.loops;

public class P15 {

	public static void main(String[] args) {
		int m=2,n=10,product=1;
		if(m>=1 && m<=n) {
			for(int i=m;i<=n;i++) {
				if(i%2==0) {
					product*=i;
					System.out.println("the product of even numbers between "+m+" and "+n+" is "+product);
				}
			}
		}
	}

}
