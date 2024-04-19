package com.jsp.imp_questions_loops;

public class P1 {

	public static void main(String[] args) {
		int num=10,count=0;
		@SuppressWarnings("unused")
		int rem=0;
		while(num!=0) {
			
			rem+=num%10;
			count++;
			num/=10;
		}
		if(count>0) {
			System.out.println(count);
			
		}else {
			System.out.println(num);
		}
	}

}
