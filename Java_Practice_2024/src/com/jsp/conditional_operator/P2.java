package com.jsp.conditional_operator;

public class P2 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3, num4 = -4;
		int min = num1;

//		int min1=num1<num2?num1:num2;
//		int min2=num3<num4?num3:num4;
//		int res=min1<min2?min1:min2;
//		System.out.println("from the given number "+
//				num1+", "+num2+", "+num3+" and "+num4+" the smallest number is "+res);

		if (num2 < min) {
			min = num2;
		}
		if (num3 < min) {
			min = num3;
		}
		if (num4 < min) {
			min = num4;
		}
		System.out.println("from the given number " + num1 + ", " + num2 + ", " + num3 + " and " + num4
				+ " the smallest number is " + min);
	}

}
