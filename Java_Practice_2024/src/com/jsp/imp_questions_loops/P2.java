package com.jsp.imp_questions_loops;

public class P2 {

	public static void main(String[] args) {
		int num=12345,rem=0,rev=0,temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("the reverse of "+temp+" is "+rev);
	}

}
