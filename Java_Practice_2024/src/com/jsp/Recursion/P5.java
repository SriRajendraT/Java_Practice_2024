package com.jsp.Recursion;

public class P5 {

	public static void main(String[] args) {
		int num=1231;
		int res=revNum(num,0);
		if(num==res ) {
			System.out.println("the given number "+num+" is palindrome");
		}else {
			System.out.println("the given number "+num+" is not palindrome");
		}
	}
	
	
	public static int revNum(int num,int rev) {
		if(num==0) {
			return rev;
		}
		int rem=0;
		rem=num%10;
		rev=rev*10+rem;
		return num!=0?revNum(num/10, rev):rev;
	}

}
