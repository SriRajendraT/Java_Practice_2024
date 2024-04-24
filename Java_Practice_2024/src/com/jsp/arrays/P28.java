package com.jsp.arrays;

public class P28 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
		int search=11;
		int change=20;
		
		replaceArr(arr, search, change);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void replaceArr(int[] arr,int search,int change) {
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                arr[i] = change;
                break;
            }
        }
	}
}
