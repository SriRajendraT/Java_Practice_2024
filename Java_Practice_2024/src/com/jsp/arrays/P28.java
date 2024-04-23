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
		
		int newArr[]=replaceArr(arr, search, change);
		for(int i=0;i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
	}
	
	public static int[] replaceArr(int[] arr,int search,int change) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			arr[index]=change;
		}
		return arr;
	}
}
