package com.jsp.arrays;

public class P17 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("elements in even index are "+arr[i]);
			}
		}
	}

}
