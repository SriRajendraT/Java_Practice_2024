package com.jsp.loops;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the table you want to print ");
		int m=scanner.nextInt();
		System.out.println("Enter the maximum range you want to print ");
		int n=scanner.nextInt();
		if(m>=1 && n>=m) {
			for(int i=m;i<=n;i++) {
				System.out.println(m+" * "+i+" = "+m*i);
			}
		}else {
			System.out.println("cannot multiple value less than 0");
		}
		scanner.close();
	}

}
