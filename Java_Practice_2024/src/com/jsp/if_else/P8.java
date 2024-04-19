package com.jsp.if_else;

public class P8 {

	public static void main(String[] args) {
		char ch='b';
		int ascii=ch*1;
		if(ascii%2==0) {
			System.out.println("the given character "+ch+"'s ASCII value is "+ascii+" and it is Even");
		}else {
			System.out.println("the given character "+ch+"'s ASCII value is "+ascii+" and it is Odd");
		}
	}

}
