package com.jsp.standard_programs;

public class P14 {

	public static void main(String[] args) {
		int position=19;
		int count=0;
		for(int i=1;;i++) {
			if(addNum(i)==multiplyNum(i)) {
				count++;
				
				if(count==position) {
					System.out.println("the Spy number in the given position "+position+" is "+i);
					break;
				}
			}
		}

	}
	public static int addNum(int num) {
		int sum=0,rem=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}
	public static int multiplyNum(int num) {
		int product=1,rem=0;
		while(num!=0) {
			rem=num%10;
			product=product*rem;
			num/=10;
		}
		return product;
	}
}
