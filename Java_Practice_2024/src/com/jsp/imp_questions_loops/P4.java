package com.jsp.imp_questions_loops;

public class P4 {

	public static void main(String[] args) {
		int num=4900,rem=0,temp=num;
		while(num!=0) {
			rem=num%10;
			System.out.println("the digit in last unit place of "+temp+" is "+rem);
			num/=10;
		}
		
	}

}
