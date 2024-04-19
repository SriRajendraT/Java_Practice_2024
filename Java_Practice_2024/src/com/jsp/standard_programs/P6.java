package com.jsp.standard_programs;

public class P6 {

	public static void main(String[] args) {
		int num=1234;
		if(sumNum(num)==productNum(num)) {
			System.out.println("the given number "+num+" is Spy Number");
		}else {
			System.out.println("the given number "+num+" is not Spy Number");
		}
	}
	
	public static int sumNum(int num) {
		int rem=0,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}
	
	public static int productNum(int num) {
		int rem=0,product=1;
		while(num!=0) {
			rem=num%10;
			product=product*rem;
			num/=10;
		}
		return product;
	}

}
