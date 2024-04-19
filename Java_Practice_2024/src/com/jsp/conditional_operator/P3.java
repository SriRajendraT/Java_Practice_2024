package com.jsp.conditional_operator;

public class P3 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5,num6=-6,num7=7;
		int min=num1;
		
		int min1=num1<num2?num1:num2;
		int min2=num3<num4?num3:num4;
		int min3=num5<num6?num5:num6;
		int min4=min1<min2?min1:min2;
		int min5=min3<min4?min3:min4;
		int res=min5<num7?min5:num7;
		System.out.println("from the given numbers "+
		num1+", "+num2+", "+num3+","+num4+", "+num5+", "+num6+
		" and "+num7+" the smallest number is "+res);
		
		if(num2<min) {
			min=num2;
		}
		if(num3<min) {
			min=num3;
		}
		if(num4<min) {
			min=num4;
		}
		if(num5<min) {
			min=num5;
		}
		if(num6<min) {
			min=num6;
		}
		if(num7<min) {
			min=num7;
		}
		System.out.println("from the given numbers "+
		num1+", "+num2+", "+num3+","+num4+", "+num5+", "+num6+
		" and "+num7+" the smallest number is "+min);
	}

}
