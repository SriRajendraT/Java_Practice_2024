package com.jsp.arrays;

public class P39 {

	public static void main(String[] args) {
		int[] arr = { 1, 202, 30, 40, 50, 20, 30, 30, 2, 3, 5, 121 };
		int search=200;
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				System.out.println("from the given array the Element " + search + " found at position " + (i + 1));
                break;
			}
		}
		
		if(!found) {
			System.out.println("from the given array the Element " + search + " not found");
		}
	}

}
