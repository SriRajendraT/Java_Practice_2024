package com.jsp.conditional_operator;

public class P4 {

	public static void main(String[] args) {
		int num1 = 100, num2 = 2, num3 = 3, num4 = 4, num5 = 5,num6=-6,num7=7;
		int max=num1;
		
//		int max1=num1>num2?num1:num2;
//		int max2=num3>num4?num3:num4;
//		int max3=num5>num6?num5:num6;
//		int max4=max1>max2?max1:max2;
//		int max5=max3>max4?max3:max4;
//		int res=max5>num7?max5:num7;
//		System.out.println("from the given numbers "+
//		num1+", "+num2+", "+num3+","+num4+", "+num5+", "+num6+
//		" and "+num7+" the largest number is "+res);
		
		if(num2>max) {
			max=num2;
		}
		if(num3>max) {
			max=num3;
		}
		if(num4>max) {
			max=num4;
		}
		if(num5>max) {
			max=num5;
		}
		if(num6>max) {
			max=num6;
		}
		if(num7>max) {
			max=num7;
		}
		System.out.println("from the given numbers "+
		num1+", "+num2+", "+num3+","+num4+", "+num5+", "+num6+
		" and "+num7+" the largest number is "+max);
	}

}
